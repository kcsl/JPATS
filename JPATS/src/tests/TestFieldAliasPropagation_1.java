package tests;

import annotations.features.AliasPropagation;
import annotations.questions.PrintedType;

/**
 * This tests for type information propagation through field references
 */
@AliasPropagation(rationale="Points-to information is propagated through fields \"o1\" and \"o2\".")
@PrintedType
public class TestFieldAliasPropagation_1 implements Test {

	private static Object o1;
	private static Object o2;
	
	static class Object1 {
		public Object1(){}
	}
	
	private static void a(){
		o1 = new Object1();
	}
	
	private static void b(){
		o2 = o1;
	}
	
	public static void main(String[] args){
		a();
		b();
		System.out.println(o2.getClass());
	}
	
}
