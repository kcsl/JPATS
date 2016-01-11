package tests.type;


/**
 * This tests simple local reference type propagation
 * 
 * @author Ben Holland
 */
public class TestLocalAliasPropagation {

	static class Object1 {
		public Object1(){}
	}
	
	public static void main(String[] args){
		Object o1 = new Object1();
		Object o2 = o1;
		System.out.println(o2.getClass());
	}
	
}
