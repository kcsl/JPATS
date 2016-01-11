package tests.type;
/**
 * This tests the analysis handling of the semantics of a foreach loop over an Array type
 * 
 * @author Ben Holland
 */
public class TestForEachArray {

	static class Object1 {}

	public static void main(String[] args) {
		Object1[] objects = new Object1[1];
		objects[0] = new Object1();
		for (Object o : objects) {
			System.out.println(o.getClass());
		}
	}

}
