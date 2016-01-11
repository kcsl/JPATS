package tests.equality;

/**
 * TODO: Description
 * Reference: Lhotak 2008 Figure 3
 */
public class TestParameterContextSensitivity {

	static class Object1 {}

	private static Object alloc(){
		return new Object1();
	}
	
	public static void main(String[] args){
		Object a = alloc();
		Object b = alloc();
		
		System.out.println(a == b);
	}
	
}
