package tests;
/**
 * This tests how an analysis deals with array indexes An single dimension array
 * with two slots is assigned an object of a different type to each slot. A
 * single slot is accessed. A conservative analysis reports both potential types
 * flowing into the array. A precise analysis reports just the type that was
 * accessed.
 * 
 * @author Ben Holland
 */
public class TestArrayIndexing {

	static class Object1 {
		public Object1() {
		}

		@Override
		public String toString() {
			return "TestArrayIndexing$Object1$toString";
		}
	}

	static class Object2 {
		public Object2() {
		}

		@Override
		public String toString() {
			return "TestArrayIndexing$Object2$toString";
		}
	}

	public static void fill1(Object[] a) {
		a[0] = new Object1();
	}

	public static void fill2(Object[] a) {
		a[1] = new Object1();
	}

	static Object[] a = new Object[2];

	public static void main(String[] args) {
		fill1(a);
		fill2(a);
		Object object = a[0];
		System.out.println(object.toString());
	}
}
