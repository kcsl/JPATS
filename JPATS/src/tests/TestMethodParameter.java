package tests;
/**
 * This tests simple flows through method parameters
 * 
 * @author Ben Holland
 */
public class TestMethodParameter {

	static class Object1 {
		public Object1(){}
		
		@Override
		public String toString(){
			return "TestMethodParameter$Object1$toString";
		}
	}
	
	private static void printObject(Object o){
		System.out.println(o.toString());
	}
	
	public static void main(String[] args){
		Object1 o = new Object1();
		printObject(o);
	}
	
}
