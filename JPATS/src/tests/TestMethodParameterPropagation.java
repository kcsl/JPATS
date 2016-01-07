package tests;
/**
 * This tests the propagation of type information through through method
 * parameters
 * 
 * @author Ben Holland
 */
public class TestMethodParameterPropagation {

	static class Object1 {
		public Object1() {}

		@Override
		public String toString() {
			return "TestMethodParameterPropagation$Object1$toString";
		}
	}

	private static void printObject(Object o) {
		printObject2(o);
	}

	private static void printObject2(Object o) {
		System.out.println(o.toString());
	}

	public static void main(String[] args) {
		Object1 o = new Object1();
		printObject(o);
	}

}
