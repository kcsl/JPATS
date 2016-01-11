package tests.type;
/**
 * This tests flows propagated through field array accesses
 * 
 * @author Ben Holland
 */
public class TestArrayFieldAccessPropagation {

	private static Object[] a1 = new Object[1];
	private static Object[] a2 = new Object[1];
	
	static class Object1 {}
	
	public static void main(String[] args) {
		a1[0] = new Object1();
		a2[0] = a1[0];
		System.out.println(a2[0].getClass());
	}
	
}
