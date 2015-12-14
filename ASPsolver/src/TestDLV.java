import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

import jaspwrapper.analyzer.OutputAnalyzerFactory;
import jaspwrapper.exec.EngineRunner;
//import jaspwrapper.exec.Grounder;
import jaspwrapper.exec.Program;
import jaspwrapper.exec.Solver;
import jaspwrapper.items.Atom;
import jaspwrapper.items.Model;


public class TestDLV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		Program p3 = new Program();
		try {
			/*String f = fixPath(new File("resources/dl/UML2RDBMS(2).dl").getPath());
			String metamodelName = "x_SimpleClass";
			String srcMetamodelName = "x_SimpleRDBMS";*/
			/*String f = fixPath(new File("resources/HierarchicalSM2NonHierarchicalSM.dl").getPath());
			String metamodelName = "x_SimpleNonHierarchicalStateMachine";
			String srcMetamodelName = "x_SimpleHierarchicalStateMachine";*/
			String f = fixPath(new File("resources/dl/FASE15/SM2HSM_FASE_3U.dl").getPath());
			String metamodelName = "x_HSM";
			String srcMetamodelName = "x_SM";
			
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
		
		///
		
		String result = "";
		String nodes = "";
		String edges = "";
		String props = "";
		String srcNodes = "";
		String srcEdges = "";
		String srcProps = "";
		String traces = "";
		String current = "";
		int i=1;
		boolean isSourceSet = false;
		while (myEngine.hasMoreModel()) {
			Model model = myEngine.nextModel();
			Iterator<Atom> it = model.iterator();
			result += "\n%%%% Target Model " + i++ + "\nmodel(m" + i + "," + metamodelName + ").\n";
			nodes = "";
			edges = "";
			props = "";
			while(it.hasNext()) {
				current = it.next().toString();
				System.out.println(current);
				if(current.startsWith("nodex") && current.contains(metamodelName)) {
					nodes += current.replaceAll("nodex", "node") + ".\n";
				}
				if(current.startsWith("edgex") && current.contains(metamodelName)) {
					edges += current.replaceAll("edgex", "edge") + ".\n";
				}
				if(current.startsWith("propx") && current.contains(metamodelName)) {
					props += current.replaceAll("propx", "prop") + ".\n";
				}
				if(!isSourceSet) {
					if(current.startsWith("node(") && current.contains(srcMetamodelName)) {
						srcNodes += current + ".\n";
					}
					if(current.startsWith("edge(") && current.contains(srcMetamodelName)) {
						srcEdges += current + ".\n";
					}
					if(current.startsWith("prop(") && current.contains(srcMetamodelName)) {
						srcProps += current + ".\n";
					}
					if(current.startsWith("trace") && current.contains(srcMetamodelName)) {
						traces += current + ".\n";
					}						
					if(!it.hasNext()) {
						isSourceSet = true;
					}
				}
			}
			result += nodes + edges + props;
		}
		result += "\n%%%% Source Model \nmodel(source," + srcMetamodelName + ").\n";
		result += srcNodes + srcEdges + srcProps;
		result += "\n%%%% Traces\n";
		result += traces;
		writeToFile(result, "resources/dl/FASE15/result_SM2HSM_FASE.dl");
		
		
		///
		
		/*while (myEngine.hasMoreModel()) {
		    Model model = myEngine.nextModel();
		    System.out.println(model);
		}*/
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
