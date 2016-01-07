package tests;
/**
 * This tests propagation of type information through simple local array
 * accesses to a multi-dimensional array components
 * 
 * @author Ben Holland
 */
public class TestDoubleArrayAccessPropagation {

	static class Object1 {
		public Object1() {}

		@Override
		public String toString() {
			return "TestDoubleArrayAccessPropagation$Object1$toString";
		}
	}

	public static void main(String[] args) {
		Object[][] a = new Object[1][1];
		a[0][0] = new Object1();
		Object[][] a2 = new Object[1][1];
		a2[0][0] = a[0][0];
		System.out.println(a2[0][0].toString());
	}

}
