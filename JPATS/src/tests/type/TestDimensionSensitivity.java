package tests.type;
/**
 * Tests dimension sensitivity of arrays
 * 
 * @author Ben Holland
 */
public class TestDimensionSensitivity {

	static class Object1 {}
	
	static class Object2 {}
	
	public static void main(String[] args) {
		Object[][] a = new Object[2][2];
		// fill dimension 1 with Object1
		a[0][0] = new Object1();
		a[0][1] = new Object1();
		// fill dimension 2 with Object2
		a[1][0] = new Object2();
		a[1][1] = new Object2();
		// read out an Object of type Object2 from the second dimension
		Object o = a[1][1];
		System.out.print(o.getClass());
	}

}
