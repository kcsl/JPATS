package tests;
/**
 * Tests circular references such as o1->o2->o3->o1
 * 
 * @author Ben Holland
 */
public class TestCircularReferences {

	static class Object1 {
		public Object1(){}
		
		@Override
		public String toString(){
			return "TestCircularReferences$Object1$toString";
		}
	}
	
	public static void main(String[] args) {
		Object o1 = new Object1();
		Object o2 = o1;
		Object o3 = o2;
		o1 = o3;
		System.out.println(o1.toString());
	}

}