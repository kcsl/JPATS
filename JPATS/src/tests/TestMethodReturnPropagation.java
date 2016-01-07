package tests;
/**
 * This tests the propagation of type information through through method returns
 * 
 * @author Ben Holland
 */
public class TestMethodReturnPropagation {

	static class Object1 {
		public Object1() {}

		@Override
		public String toString() {
			return "TestMethodReturnPropagation$Object1$toString";
		}
	}

	private static Object getObject() {
		return getObject2();
	}

	private static Object getObject2() {
		return new Object1();
	}

	public static void main(String[] args) {
		System.out.println(getObject().toString());
	}

}
