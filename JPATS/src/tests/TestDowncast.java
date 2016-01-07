package tests;
/**
 * This tests if an analysis handles explicit downcasting
 * 
 * Note: While some analyzers may take advantage of this information as a
 * context clue (assuming the cast is always valid) this clue is not needed to
 * correctly infer the runtime type
 * 
 * @author Ben Holland
 */
public class TestDowncast {

	static class Object1 {
		public Object1() {}

		@Override
		public String toString() {
			return "TestDowncast$Object1$toString";
		}
	}

	public static Object getObject() {
		return new Object1();
	}

	public static void main(String[] args) {
		Object o = (Object1) getObject();
		System.out.println(o.toString());
	}

}
