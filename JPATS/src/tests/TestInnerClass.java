package tests;
/**
 * This tests that the analysis handles inner class types
 * 
 * @author Ben Holland
 */
public class TestInnerClass {

	static class Object1 {
		public Object1() {}

		@Override
		public String toString() {
			return "TestInnerClass$Object1$toString";
		}
	}

	public static void main(String[] args) {
		Object o = new Object1();
		System.out.println(o.toString());
	}
}
