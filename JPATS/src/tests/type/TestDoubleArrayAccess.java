package tests.type;
/**
 * This tests simple local array access to a multi-dimensional array component
 * 
 * @author Ben Holland
 */
public class TestDoubleArrayAccess {

	static class Object1 {}
	
	public static void main(String[] args) {
		Object[][] a = new Object[1][1];
		a[0][0] = new Object1();
		System.out.println(a[0][0].getClass());
	}

}
