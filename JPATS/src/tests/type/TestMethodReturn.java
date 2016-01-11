package tests.type;
/**
 * This tests simple flows through method returns
 * 
 * @author Ben Holland
 */
public class TestMethodReturn {

	static class Object1 {}

	private static Object getObject() {
		return new Object1();
	}

	public static void main(String[] args) {
		System.out.println(getObject().getClass());
	}

}
