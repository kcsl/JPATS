package tests;

import annotations.questions.PrintedType;
import annotations.sensitivities.PathSensitivity;
import annotations.sensitivities.paths.LoopSensitivity;

/**
 * This tests if the analysis is path sensitive
 * 
 * An analysis that does path feasibility or symbolic execution should pass this
 * test. An analysis that is not path sensitive will conservatively report that
 * both Object1 and Object2 are possible, when really only Object2 is possible
 * at runtime.
 */
@PathSensitivity(k=2, rationale="Object \"o\" is conditionally overwritten with an instance of type Object2 in the second loop if \"z\" is true, which is set to true in the first loop.")
@LoopSensitivity(rationale="The path depends on a loop entry conditions for (x==y) and (z==true).")
@PrintedType
public class TestLoopPathLevel2Sensitivity implements Test {

	static class Object1 {}

	static class Object2 {}

	static int x = 1;
	static int y = 1;
	
	static boolean z = false;
	
	public static void main(String[] args) {
		Object o = new Object1();
		while (x == y) {
			z = true;
			break;
		}
		
		while (z) {
			o = new Object2();
			break;
		}
		System.out.println(o.getClass());
	}

}
