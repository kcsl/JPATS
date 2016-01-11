package tests.type;


/**
 * This tests for type information propagation through field references
 */
public class TestFieldAliasPropagation_1 {

	private static Object o1;
	private static Object o2;
	
	static class Object1 {
		public Object1(){}
	}
	
	private static void a(){
		o1 = new Object1();
	}
	
	private static void b(){
		o2 = o1;
	}
	
	public static void main(String[] args){
		a();
		b();
		System.out.println(o2.getClass());
	}
	
}
