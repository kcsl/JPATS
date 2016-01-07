package tests;

import annotations.questions.PrintedType;
import annotations.sensitivities.FieldSensitivity;

/**
 * This tests for type information propagation through field references
 */
@FieldSensitivity(rationale="A field insensitive analysis would likely conservatively report Object1 or Object as the printed type.")
@PrintedType
public class TestFieldSensitivity_1 implements Test {

	static Object o1;
	static Object o2;
	
	static class Object1 {}
	
	static class Object2 {}
	
	private static void a(){
		o1 = new Object1();
	}
	
	private static void b(){
		o2 = new Object2();
	}
	
	public static void main(String[] args){
		a();
		b();
		System.out.println(o1.getClass());
	}
	
}
