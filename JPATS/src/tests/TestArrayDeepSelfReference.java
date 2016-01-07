package tests;
/**
 * Tests an array that stores a reference to itself
 * Credit to Jon Mathews and Tom Deering for example
 * 
 * @author Ben Holland
 */
public class TestArrayDeepSelfReference {

	public static void main(String[] args) {
		Object[] a1 = new Object[1];
		a1[0] = (Object) a1;
		
		Object[] a2 = a1;
		a2[0] = (Object) a2;
		
		Object[] a3 = a2;
		a3[0] = (Object) a3;
		
		Object[] a4 = a3;
		
		System.out.println(a4.toString());
	}

}
