package tests;

import annotations.features.AliasPropagation;
import annotations.questions.PrintedType;

/**
 * This tests simple local reference type propagation
 * 
 * @author Ben Holland
 */
@AliasPropagation(rationale="Test a propagation of points-to information intra-procedurally")
@PrintedType
public class TestLocalAliasPropagation implements Test {

	static class Object1 {
		public Object1(){}
	}
	
	public static void main(String[] args){
		Object o1 = new Object1();
		Object o2 = o1;
		System.out.println(o2.getClass());
	}
	
}
