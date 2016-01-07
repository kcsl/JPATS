package tests;

import annotations.questions.InstanceEquality;
import annotations.sensitivities.ContextSensitivity;
import annotations.sensitivities.context.CallsiteSensitivity;

/**
 * TODO: Description
 * Reference: Lhotak 2008 Figure 3
 */
@ContextSensitivity(rationale="A context insensitive analysis would assign the same instance of a type Object1 to \"a\" and \"b\".")
@CallsiteSensitivity(rationale="The \"alloc\" method contains no parameters to distguish different contexts and both calls to \"alloc\" have the same receiver so the only differentiating context is the callsite.")
@InstanceEquality
public class TestCallsiteContextSensitivity {

	static class Object1 {}

	private static Object alloc(){
		return new Object1();
	}
	
	public static void main(String[] args){
		Object a = alloc();
		Object b = alloc();
		
		System.out.println(a == b);
	}

}
