package tests;
/**
 * This tests interprocedural field access
 * 
 * @author Ben Holland
 */
public class TestInterproceduralFieldAccess {

	private static Object a;

	static class Object1 {
		public Object1() {}

		@Override
		public String toString() {
			return "TestInterproceduralFieldAccess$Object1$toString";
		}
	}

	public static Object reader() {
		return a;
	}

	public static void writer(Object object) {
		a = object;
	}

	public static void main(String[] args) {
		writer(new Object1());
		Object o2 = reader();
		System.out.println(o2.toString());
	}

}
