package tests;

import annotations.questions.PrintedType;
import annotations.sensitivities.ArrayComponentSensitivity;
import annotations.sensitivities.FieldSensitivity;

/**
 * This tests flows through field array accesses
 */
@ArrayComponentSensitivity(rationale="An instance of Object1 is placed in an array \"a\" with a single array component and then immediately accessed.")
@FieldSensitivity(rationale="The Object[] \"a\" is a field.")
@PrintedType
public class TestArrayFieldAccess implements Test {

	private static Object[] a = new Object[1];
	
	static class Object1 {
		public Object1(){}
	}
	
	public static void main(String[] args) {
		a[0] = new Object1();
		System.out.println(a[0].getClass());
	}
	
}
