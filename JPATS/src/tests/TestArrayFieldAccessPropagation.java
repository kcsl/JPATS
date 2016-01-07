package tests;
/**
 * This tests flows propagated through field array accesses
 * 
 * @author Ben Holland
 */
public class TestArrayFieldAccessPropagation {

	private static Object[] a1 = new Object[1];
	private static Object[] a2 = new Object[1];
	
	static class Object1 {
		public Object1(){}
		
		@Override
		public String toString(){
			return "TestArrayFieldAccessPropagation$Object1$toString";
		}
	}
	
	public static void main(String[] args) {
		a1[0] = new Object1();
		a2[0] = a1[0];
		System.out.println(a2[0].toString());
	}
	
}
