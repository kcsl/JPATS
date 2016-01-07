package tests;

import annotations.questions.PrintedType;
import annotations.sensitivities.PathSensitivity;
import annotations.sensitivities.paths.ExceptionSensitivity;

/**
 * This tests if the analysis is path sensitive
 * 
 * An analysis that does path feasibility or symbolic execution should pass this
 * test. An analysis that is not path sensitive will conservatively report that
 * both Object1 and Object2 are possible, when really only Object2 is possible
 * at runtime.
 */
@PathSensitivity(k=1, rationale="Object \"o\" is conditionally overwritten with an instance of type Object2.  In this program the catch block is never executed.")
@ExceptionSensitivity(rationale="The path depends on whether or not an exception is caught in the catch block.")
@PrintedType
public class TestExceptionPathSensitivity_2 implements Test {

	static class Object1 {}

	static class Object2 {}

	public static void main(String[] args) {
		Object o = new Object1();
		
		try {
			
		} catch (Exception e) {
			o = new Object2();
		} finally {
			
		}
		
		System.out.println(o.getClass());
	}

}
