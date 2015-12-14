import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import jaspwrapper.analyzer.OutputAnalyzerFactory;
import jaspwrapper.exec.EngineRunner;
//import jaspwrapper.exec.Grounder;
import jaspwrapper.exec.Program;
import jaspwrapper.exec.Solver;
import jaspwrapper.items.Atom;
import jaspwrapper.items.Model;


public class TestDLVAnalyzer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		Program p3 = new Program();
		try {
			String f = fixPath(new File("resources/analyzer/UML2RDBMS_analysis.dl").getPath());
			String leftMM = "uml";
			String rightMM = "rdbms";
			
			//System.out.println(f);
			p3.addFromFile(f);
		    p3.end();
		
		//f = fixPath(new File("lib/lparse.exe").getPath());
		//Grounder grounder = new Grounder (f);
		//f = fixPath(new File("lib/dl-complex.win.20090727.beta.exe").getPath());
		f = fixPath(new File("lib/dl-complex.mac.20110713.beta").getPath());
		
		Solver solver = new Solver (f);
		
		//grounder.setOptions("-c n=8 -D");
		solver.setOptions("");
		
		EngineRunner myEngine = new EngineRunner(solver);
		myEngine.setOS("unix");
		//myEngine.setOS("windows");
		
		myEngine.setSolverType(OutputAnalyzerFactory.DLV);
		
		myEngine.loadProgram(p3);
		myEngine.compute();

		List<String> nonDetLeftList = new ArrayList<String>(); 
		List<String> nonDetRightList = new ArrayList<String>();
		List<String> ambiguousLeftList = new ArrayList<String>();
		List<String> ambiguousRightList = new ArrayList<String>();
		
		String result = "";
		String current = "";
		int i=1;
		//boolean isSourceSet = false;
		while (myEngine.hasMoreModel()) {
			Model model = myEngine.nextModel();
			Iterator<Atom> it = model.iterator();
			
			result += "\n%%%% Analysis Model " + i++ +"\n"; //+ "\nmodel(m" + i + ").\n"; "," + metamodelName + ").\n";
			//nodes = "";
			//edges = "";
			//props = "";
			
			while(it.hasNext()) {
				current = it.next().toString();
				System.out.println(current);

				if(current.startsWith("non_deterministic_relation") && current.contains(leftMM)) {
					//nonDetLeft += current.replaceAll(","+leftMM , "") + ".\n"; 
					nonDetLeftList.add(current.replaceAll(","+leftMM , "").replaceAll("non_deterministic_relation", ""));
				}
				if(current.startsWith("non_deterministic_relation") && current.contains(rightMM)) {
					//nonDetRight += current.replaceAll(","+rightMM , "") + ".\n";
					nonDetRightList.add(current.replaceAll(","+rightMM , "").replaceAll("non_deterministic_relation", ""));
				}
				if(current.startsWith("are_ambiguous_relations") && current.contains(leftMM) && !ambiguousLeftList.contains(switchIDinAmbiguousRelations(current))){
					//System.out.println("*"+switchIDinAmbiguousRelations(current));
					ambiguousLeftList.add(current);
				}
				if(current.startsWith("are_ambiguous_relations") && current.contains(rightMM) && !ambiguousRightList.contains(switchIDinAmbiguousRelations(current))){
					//System.out.println("*"+switchIDinAmbiguousRelations(current));
					ambiguousRightList.add(current);
				}
			}
						
			List<Set<String>> resL = getSetsOfNondetRelations(ambiguousLeftList);		
			List<Set<String>> resR = getSetsOfNondetRelations(ambiguousRightList);	
			
			result += "\n%%%% non-deterministic relations " + leftMM + " to " + rightMM + ":\n" + nonDetRightList.toString() + "\n" 
					  + "\n%%%% non-deterministic relations " + rightMM + " to " + leftMM + ":\n" + nonDetLeftList.toString() + "\n" 
					  + "\n%%%% set of ambiguous relations " + leftMM + " to " + rightMM + ": \n" +  resR.toString() + "\n"
					  + "\n%%%% set of ambiguous relations " + rightMM + " to " + leftMM + ": \n" +  resL.toString() + "\n";
		}
		
		writeToFile(result, "resources/analyzer/UML2RDBMS_analysis_result.dl");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static List<Set<String>> getSetsOfNondetRelations(List<String> ambiguousList){
		
		List<Set<String>> res = new ArrayList<Set<String>>();

		/*List<String> ambiguousLeftList1 = new ArrayList<String>();	
		ambiguousLeftList1.add("are_ambiguous_relations(1,3,uml)");
		ambiguousLeftList1.add("are_ambiguous_relations(1,5,uml)");
		ambiguousLeftList1.add("are_ambiguous_relations(3,5,uml)");
		ambiguousLeftList1.add("are_ambiguous_relations(4,6,uml)");*/
		
		Iterator<String> a = ambiguousList.iterator();	
		
		while(a.hasNext()) {
			String aa = a.next();
			String id1 = getIDAmbiguousRelations(aa.toString(),1);
			String id2 = getIDAmbiguousRelations(aa.toString(),2);
			boolean trovato = false; 
			Iterator<Set<String>> is = res.iterator();			
			
			while(is.hasNext()){
					Set<String> iss = is.next();
				if (iss.contains(id1) || iss.contains(id2)){
					trovato = true;
					iss.add(id1);
					iss.add(id2);
				};
			}
			if (!trovato){
				Set<String> s = new HashSet<String>();
				s.add(id1);
				s.add(id2);
				res.add(s);			
			}
			
		}
		return res;
	
}
	
	//are_ambiguous_relations(1,3,rdbms) -> are_ambiguous_relations(3,1,rdbms)
	private static String switchIDinAmbiguousRelations(String current){
		String pattern = "are_ambiguous_relations[\\(]([a-zA-Z0-9]+)[\\,]([a-zA-Z0-9]+)[\\,](\\w+)[\\)]";
		return current.replaceAll("$1", "$2").replaceAll("$2", "$1");
		
	}
	
	private static String getIDAmbiguousRelations(String current, int i){
		//are_ambiguous_relations(1,3,rdbms)
		String pattern = "are_ambiguous_relations[\\(]([a-zA-Z0-9]+)[\\,]([a-zA-Z0-9]+)[\\,](\\w+)[\\)]";
		String id = current.replaceAll(pattern, "$"+i); 
		return id;
	}
	
	
	private static void writeToFile(String content, String filePath) {
		try{
			// Create file 
			FileWriter fstream = new FileWriter(filePath);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(content);
			//Close the output stream
			out.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	public static String readFile(String filePath) {
		String result = "";
		try{
			// Create file 
			FileReader fstream = new FileReader(filePath);
			BufferedReader out = new BufferedReader(fstream);
			while(out.ready()) {
				result += out.readLine() + "\n";
			}
			//Close the output stream
			out.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		return result;
	}

	private static String fixPath(String path) {
		return path.replaceAll("\\\\", "\\\\\\\\");
	}

}

