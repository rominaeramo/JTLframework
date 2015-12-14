import jaspwrapper.exec.EngineRunner;
import jaspwrapper.exec.Grounder;
import jaspwrapper.exec.Program;
import jaspwrapper.exec.Solver;
import jaspwrapper.items.Atom;
import jaspwrapper.items.Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Program p3 = new Program();
		try {
//			File file = new File("../SOSYMcaseStudy/metamodels/saveccm_A0.sm");
//			writeToFile(readFile(file.getAbsolutePath()), "resources/temp.sm");
//			String f = fixPath(new File("resources/saveCCM2A0.sm").getPath());
//			String metamodelName = "_x_A0";
//			String srcMetamodelName = "_x_saveccm";
//			String f = fixPath(new File("resources/A02saveCCM.sm").getPath());
//			String metamodelName = "_x_saveccm";
//			String srcMetamodelName = "_x_A0";
//			String f = fixPath(new File("resources/testID.sm").getPath());
//			String metamodelName = "_x_A0";
//			String srcMetamodelName = "_x_saveccm";
//			String f = fixPath(new File("resources/testVar.sm").getPath());
//			String metamodelName = "_x_A0";
//			String srcMetamodelName = "_x_saveccm";
//			String f = fixPath(new File("resources/UML2RDBMS.sm").getPath());
//			String metamodelName = "_x_SimpleRDBMS";
//			String srcMetamodelName = "_x_SimpleClass";
			String f = fixPath(new File("resources/sm/UML2RDBMS.sm").getPath());
			String metamodelName = "_x_SimpleRDBMS";
			String srcMetamodelName = "_x_SimpleClass";

			p3.addFromFile(f);
			p3.end();

			f = fixPath(new File("lib/lparse.exe").getPath());
			Grounder grounder = new Grounder (f);
			f = fixPath(new File("lib/smodels.exe").getPath());
			Solver solver = new Solver (f);

			//grounder.setOptions("-c n=8 -D");
			solver.setOptions("0");

			EngineRunner myEngine = new EngineRunner(solver,grounder);
			myEngine.setOS("windows");

			myEngine.loadProgram(p3);
			myEngine.compute();

			//
			
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
					if(current.startsWith("node'") && current.contains(metamodelName)) {
						nodes += current.replaceAll("node\'", "node") + ".\n";
					}
					if(current.startsWith("edge'") && current.contains(metamodelName)) {
						edges += current.replaceAll("edge\'", "edge") + ".\n";
					}
					if(current.startsWith("prop'") && current.contains(metamodelName)) {
						props += current.replaceAll("prop\'", "prop") + ".\n";
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
			writeToFile(result, "resources/result.sm");
		} catch (Exception e) {
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
