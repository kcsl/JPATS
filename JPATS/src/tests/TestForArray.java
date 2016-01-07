package tests;
/**
 * This tests the analysis handling of the semantics of a simple for loop over an Array type
 * 
 * @author Ben Holland
 */
public class TestForArray {

	static class Object1 {
		public Object1() {}

		@Override
		public String toString() {
			return "TestForArray$Object1$toString";
		}
	}

	public static void main(String[] args) {
		Object1[] objects = new Object1[1];
		objects[0] = new Object1();
		for (int i=0; i<objects.length; i++) {
			Object o = objects[i];
			System.out.println(o.toString());
		}
	}

}
