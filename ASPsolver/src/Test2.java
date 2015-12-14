import java.io.File;

import jaspwrapper.exec.EngineRunner;
import jaspwrapper.exec.Grounder;
import jaspwrapper.exec.Program;
import jaspwrapper.exec.Solver;
import jaspwrapper.items.Model;


public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program p3 = new Program();
		try {
			String f = fixPath(new File("resources/test.sm").getPath());
			System.out.println(f);
				
			
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
		
		while (myEngine.hasMoreModel()) {
		    Model model = myEngine.nextModel();
		    System.out.println(model);
		}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static String fixPath(String path) {
		return path.replaceAll("\\\\", "\\\\\\\\");
	}

}
