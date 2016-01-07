package tests;
import annotations.questions.PrintedType;
import annotations.sensitivities.ArrayComponentSensitivity;

/**
 * This tests simple local array access to a single array component
 * 
 * @author Ben Holland
 */
@ArrayComponentSensitivity(rationale="An instance of Object1 is placed in an array \"a\" with a single array component and then immediately accessed.")
@PrintedType
public class TestArrayAccess implements Test {

	static class Object1 {
		public Object1(){}
	}
	
	public static void main(String[] args) {
		Object[] a = new Object[1];
		a[0] = new Object1();
		System.out.println(a[0].getClass());
	}

}
