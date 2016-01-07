package tests;

import annotations.questions.PrintedType;
import annotations.sensitivities.FlowSensitivity;

@FlowSensitivity(rationale="The value of \"o\" is overwritten with the instance of type Object2, overwritting the instance of type Object1.")
@PrintedType
public class TestFlowSensitivity implements Test {

	static class Object1 {}

	static class Object2 {}

	public static void main(String[] args) {
		Object o = new Object1();
		o = new Object2();
		System.out.println(o.getClass());
	}
	
}
