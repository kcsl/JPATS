package tests.type;
/**
 * This tests simple flows through method parameters
 * 
 * @author Ben Holland
 */
public class TestMethodParameter {

	static class Object1 {}
	
	private static void printObject(Object o){
		System.out.println(o.getClass());
	}
	
	public static void main(String[] args){
		Object1 o = new Object1();
		printObject(o);
	}
	
}
