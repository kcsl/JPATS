package tests.type;


/**
 * This tests for type information propagation through field references
 */
public class TestFieldAliasPropagation_2 {

	static class Container1 {
		public static Object o1;
		public static Object o2;
	}
	
	static class Container2 {
		public static Object o1;
		public static Object o2;
	}
	
	static class Object1 {}
	
	static class Object2 {}
	
	public static void main(String[] args){
		// create two distinct objects
		Object o1 = new Object1();
		Object o2 = new Object2();
		
		// set Container1 o1 and o2 fields to o1 and o2 respectively
		Container1.o1 = o1;
		Container1.o2 = o2;
		
		// set Container2 o1 and o2 fields to o1 and o2 fields of Container1 respectively
		Container2.o1 = Container1.o1;
		Container2.o2 = Container1.o2;
		
		// print the type of Container2 o1
		System.out.println(Container2.o1.getClass());
	}
	
}
