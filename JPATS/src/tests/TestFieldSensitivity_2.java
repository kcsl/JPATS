package tests;

import annotations.questions.PrintedType;
import annotations.sensitivities.FieldSensitivity;

/**
 * This tests for type information propagation through field references
 */
@FieldSensitivity(rationale="A field insensitive analysis would likely conservatively report Object1 or Object as the printed type.")
@PrintedType
public class TestFieldSensitivity_2 implements Test {

	static class Container {
		public Object o1;
		public Object o2;
	}
	
	static class Object1 {}
	
	static class Object2 {}
	
	public static void main(String[] args){
		Container c = new Container();
		c.o1 = new Object1();
		c.o2 = new Object2();
		System.out.println(c.o1.getClass());
	}
	
}
