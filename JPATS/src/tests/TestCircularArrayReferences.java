package tests;
/**
 * Tests circular references of arrays such as a1->a2->a3->a1
 * 
 * @author Ben Holland
 */
public class TestCircularArrayReferences {

	static class Object1 {
		public Object1(){}
		
		@Override
		public String toString(){
			return "TestCircularArrayReferences$Object1$toString";
		}
	}
	
	public static void main(String[] args) {
		Object[] a1 = new Object[1];
		a1[0] = new Object1();
		Object[] a2 = a1;
		Object[] a3 = a2;
		a1 = a3;
		System.out.println(a1[0].toString());
	}

}
