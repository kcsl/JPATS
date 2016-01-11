package tests.type;


public class TestFlowSensitivity {

	static class Object1 {}

	static class Object2 {}

	public static void main(String[] args) {
		Object o = new Object1();
		o = new Object2();
		System.out.println(o.getClass());
	}
	
}
