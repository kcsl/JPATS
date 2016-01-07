package tests;
/**
 * This tests simple flows through method returns
 * 
 * @author Ben Holland
 */
public class TestMethodReturn {

	static class Object1 {
		public Object1() {}

		@Override
		public String toString() {
			return "TestMethodReturn$Object2$toString";
		}
	}

	private static Object getObject() {
		return new Object1();
	}

	public static void main(String[] args) {
		System.out.println(getObject().toString());
	}

}
