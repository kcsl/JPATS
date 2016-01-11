package tests.type;


/**
 * This tests for type information propagation through field references
 */
public class TestFieldSensitivity_1 {

	static Object o1;
	static Object o2;
	
	static class Object1 {}
	
	static class Object2 {}
	
	private static void a(){
		o1 = new Object1();
	}
	
	private static void b(){
		o2 = new Object2();
	}
	
	public static void main(String[] args){
		a();
		b();
		System.out.println(o1.getClass());
	}
	
}
