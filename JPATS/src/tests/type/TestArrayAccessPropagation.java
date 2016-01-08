package tests.type;


/**
 * This tests the propagation of a simple local array access to a single array
 * component to another array component
 */
public class TestArrayAccessPropagation {

	static class Object1 {
		public Object1() {}
	}

	public static void main(String[] args) {
		// create an array with a single component
		Object[] a = new Object[1];
		
		// place an instance of Object1 in the array
		a[0] = new Object1();
		
		// create a second array
		Object[] a2 = new Object[1];
		
		// place the instance of Object1 in the second array
		a2[0] = a[0];
		
		// print the type of the instance in the second array component
		System.out.println(a2[0].getClass());
	}

}
