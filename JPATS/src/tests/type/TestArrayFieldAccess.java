package tests.type;

/**
 * This tests flows through field array accesses
 */
public class TestArrayFieldAccess {

	private static Object[] a = new Object[1];
	
	static class Object1 {
		public Object1(){}
	}
	
	public static void main(String[] args) {
		a[0] = new Object1();
		System.out.println(a[0].getClass());
	}
	
}
