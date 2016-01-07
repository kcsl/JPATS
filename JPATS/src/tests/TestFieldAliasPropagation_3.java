package tests;

import annotations.features.AliasPropagation;
import annotations.questions.PrintedType;
import annotations.sensitivities.FieldSensitivity;
import annotations.sensitivities.ObjectSensitivity;

/**
 * This tests for type information propagation through field references
 */
@AliasPropagation(rationale="Points-to information is propagated through object member fields")
@FieldSensitivity(rationale="If the analysis is not field sensitive then it will likely report that Container2.o1 could contain both Objects \"o1\" and \"o2\".")
@ObjectSensitivity(k=2, rationale="Container objects must be distiguished in order to distiguish the stored objects in the container.")
@PrintedType
public class TestFieldAliasPropagation_3 implements Test {

	static class Container {
		public Object o1;
		public Object o2;
	}
	
	static class Object1 {}
	
	static class Object2 {}
	
	public static void main(String[] args){
		// create two distinct objects
		Object o1 = new Object1();
		Object o2 = new Object2();
		
		// set Container c1 o1 and o2 fields to o1 and o2 respectively
		Container c1 = new Container();
		c1.o1 = o1;
		c1.o2 = o2;
		
		// set Container c2 o1 and o2 fields to o1 and o2 fields of Container c1 respectively
		Container c2 = new Container();
		c2.o1 = c1.o1;
		c2.o2 = c1.o2;
		
		// print the type of Container c1.o1
		System.out.println(c2.o1.getClass());
	}
	
}
