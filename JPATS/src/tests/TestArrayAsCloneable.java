package tests;
/**
 * This tests type propagation through an array treated as a Cloneable 
 *
 * @author Ben Holland
 */
public class TestArrayAsCloneable {

	static class Object1 {
		public Object1(){}
		
		@Override
		public String toString(){
			return "TestArrayAsCloneable$Object1$toString";
		}
	}
	
	public static void main(String[] args) {
		Object[] a1 = new Object[1];
		a1[0] = new Object1();
		Cloneable a2 = a1;
		Object o = ((Object[]) a2)[0];
		System.out.println(o.toString());
	}

}