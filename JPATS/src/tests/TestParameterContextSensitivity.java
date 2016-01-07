package tests;

import annotations.questions.InstanceEquality;
import annotations.sensitivities.ContextSensitivity;
import annotations.sensitivities.context.ParameterSensitivity;

/**
 * TODO: Description
 * Reference: Lhotak 2008 Figure 3
 */
@ContextSensitivity(rationale="TODO")
@ParameterSensitivity(rationale="TODO")
@InstanceEquality
public class TestParameterContextSensitivity {

	static class Object1 {}

	private static Object alloc(){
		return new Object1();
	}
	
	public static void main(String[] args){
		Object a = alloc();
		Object b = alloc();
		
		System.out.println(a == b);
	}
	
//	private static Object foo(int x, Object o){
//		if(x == 0){
//			return o;
//		}
//		o = new Object1();
//		foo(x--, o);
//	}

}
