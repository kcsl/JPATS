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
@PathSensitivity(k=1, rationale="Object \"o\" is conditionally overwritten with an instance of type Object2.  In this program the conditional case is always false.")
@LoopSensitivity(rationale="The path depends on a loop entry condition.")
@PrintedType
public class TestLoopPathSensitivity_2 implements Test {

	static class Object1 {}

	static class Object2 {}

	static int x = 1;
	static int y = 1;
	
	public static void main(String[] args) {
		Object o = new Object1();
		while (x != y) {
			o = new Object2();
			break;
		}
		System.out.println(o.getClass());
	}

}
