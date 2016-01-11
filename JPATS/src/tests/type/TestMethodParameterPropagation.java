package tests.type;
/**
 * This tests the propagation of type information through through method
 * parameters
 * 
 * @author Ben Holland
 */
public class TestMethodParameterPropagation {

	static class Object1 {}

	private static void printObject(Object o) {
		printObject2(o);
	}

	private static void printObject2(Object o) {
		System.out.println(o.getClass());
	}

	public static void main(String[] args) {
		Object1 o = new Object1();
		printObject(o);
	}

}
