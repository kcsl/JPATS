package tests.other;

public class TestNullArray {

	public static void main(String[] args) {
		Object[] a = null;
		Object o1 = null;
		a[0] = null;
		Object o2 = a[0]; 
		System.out.println(o2.getClass());
	}

}
