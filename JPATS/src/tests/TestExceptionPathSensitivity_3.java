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
@PathSensitivity(k=1, rationale="Object \"o\" is conditionally overwritten with an instance of type Object2.  The finally block is always executed.")
@ExceptionSensitivity(rationale="The path goes through a finally block.")
@PrintedType
public class TestExceptionPathSensitivity_3 implements Test {

	static class Object1 {}

	static class Object2 {}

	public static void main(String[] args) {
		Object o = new Object1();
		
		try {
			throw new Exception();
		} catch (Exception e) {
			
		} finally {
			o = new Object2();
		}
		
		System.out.println(o.getClass());
	}

}
