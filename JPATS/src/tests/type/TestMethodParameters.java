package tests.type;
public class TestMethodParameters {

	static class Object1 {}
	
	static class Object2 {}
	
	static class Object3 {}
	
	private static void printObject(Object o1, Object o2, Object o3){
		System.out.println(o2.getClass());
	}
	
	public static void main(String[] args){
		Object o1 = new Object1();
		Object o2 = new Object2();
		Object o3 = new Object3();
		printObject(o1, o2, o3);
	}
	
}