package tests;
/**
 * This tests simple flows through object member variables
 * 
 * @author Ben Holland
 */
public class TestMemberVariable {

	static class Object1 {
		public Object1() {}

		@Override
		public String toString() {
			return "TestMemberVariable$Object1$toString";
		}
	}

	static class Container {
		public Object o;
	}

	public static void main(String[] args) {
		Object1 o = new Object1();
		Container c = new Container();
		c.o = o;
		System.out.println(c.o.toString());
	}

}
