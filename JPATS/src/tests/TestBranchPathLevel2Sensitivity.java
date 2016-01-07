package tests;

import annotations.questions.PrintedType;
import annotations.sensitivities.PathSensitivity;
import annotations.sensitivities.paths.BranchSensitivity;

/**
 * This tests if the analysis is path sensitive
 * 
 * An analysis that does path feasibility or symbolic execution should pass this
 * test. An analysis that is not path sensitive will conservatively report that
 * both Object1 and Object2 are possible, when really only Object2 is possible
 * at runtime.
 */
@PathSensitivity(k=2, rationale="Object \"o\" is conditionally overwritten with an instance of type Object2 in the second branch if \"z\" is true, which happens only the first branch is true.  In this program the conditional case (z==true) is always true.")
@BranchSensitivity(rationale="The path depends on an if condition branch.")
@PrintedType
public class TestBranchPathLevel2Sensitivity implements Test {

	static class Object1 {}

	static class Object2 {}

	static int x = 1;
	static int y = 1;
	static boolean z = false;
	
	public static void main(String[] args) {
		Object o = new Object1();
		if (x == y) {
			z = true;	
		}
		if (z) {
			o = new Object2();
		}
		System.out.println(o.getClass());
	}

}
