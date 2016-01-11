package tests.type;
/**
 * This tests that the analysis handles inner class types
 * 
 * @author Ben Holland
 */
public class TestInnerClass {

	static class Object1 {}

	public static void main(String[] args) {
		Object o = new Object1();
		System.out.println(o.getClass());
	}
}
