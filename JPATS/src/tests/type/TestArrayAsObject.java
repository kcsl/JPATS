package tests.type;
/**
 * This tests type propagation through an array treated as an Object 
 * 
 * "In the Java programming language, arrays are objects (4.3.1), are dynamically created, 
 * and may be assigned to variables of type Object (4.3.2). All methods of class Object 
 * may be invoked on an array. ... The direct superclass of an array type is Object."
 *
 * Reference: https://docs.oracle.com/javase/specs/jls/se7/html/jls-10.html
 *
 * @author Ben Holland
 */
public class TestArrayAsObject {

	static class Object1 {
		public Object1(){}
	}
	
	public static void main(String[] args) {
		Object[][] a1 = new Object[1][1];
		a1[0][0] = new Object1();
		Object a2 = a1;
		Object a3 = ((Object[][]) a2)[0];
		Object o = ((Object[]) a3)[0];
		System.out.println(o.getClass());
	}

}
