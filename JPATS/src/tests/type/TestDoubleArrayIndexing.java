package tests.type;
/**
 * This tests how an analysis deals with array indexes. A multi-dimensional
 * array with four total slots is assigned an object of a different type to each
 * slot. A single slot is accessed. A conservative analysis reports all
 * potential types flowing into the array. A precise analysis reports just the
 * type that was accessed.
 * 
 * @author Ben Holland
 */
public class TestDoubleArrayIndexing {

	static class Object1 {}

	static class Object2 {}

	static class Object3 {}

	static class Object4 {}

	public static void fill1(Object[][] a) {
		a[0][0] = new Object1();
	}

	public static void fill2(Object[][] a) {
		a[0][1] = new Object2();
	}

	public static void fill3(Object[][] a) {
		a[1][0] = new Object3();
	}

	public static void fill4(Object[][] a) {
		a[1][1] = new Object4();
	}

	static Object[][] a = new Object[2][2];

	public static void main(String[] args) {
		fill1(a);
		fill2(a);
		fill3(a);
		fill4(a);
		Object object = a[0][0];
		System.out.println(object.getClass());
	}
}
