package tests;

import annotations.features.AliasPropagation;
import annotations.questions.PrintedType;
import annotations.sensitivities.FieldSensitivity;

/**
 * This tests for type information propagation through field references
 */
@AliasPropagation(rationale="Points-to information is propagated through static object fields")
@FieldSensitivity(rationale="If the analysis is not field sensitive then it will likely report that Container2.o1 could contain both Objects \"o1\" and \"o2\".")
@PrintedType
public class TestFieldAliasPropagation_2 implements Test {

	static class Container1 {
		public static Object o1;
		public static Object o2;
	}
	
	static class Container2 {
		public static Object o1;
		public static Object o2;
	}
	
	static class Object1 {}
	
	static class Object2 {}
	
	public static void main(String[] args){
		// create two distinct objects
		Object o1 = new Object1();
		Object o2 = new Object2();
		
		// set Container1 o1 and o2 fields to o1 and o2 respectively
		Container1.o1 = o1;
		Container1.o2 = o2;
		
		// set Container2 o1 and o2 fields to o1 and o2 fields of Container1 respectively
		Container2.o1 = Container1.o1;
		Container2.o2 = Container1.o2;
		
		// print the type of Container2 o1
		System.out.println(Container2.o1.getClass());
	}
	
}
