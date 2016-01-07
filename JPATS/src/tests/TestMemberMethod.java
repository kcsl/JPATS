package tests;
/**
 * This tests simple flows through object member methods
 * 
 * @author Ben Holland
 */
public class TestMemberMethod {

	static class Object1 {
		public Object1() {}

		@Override
		public String toString() {
			return "TestMemberMethod$Object1$toString";
		}
	}

	static class Container {
		private Object o;

		public Container(Object o) {
			this.o = o;
		}

		public Object getObject() {
			return o;
		}
	}

	public static void main(String[] args) {
		Object1 o = new Object1();
		Container c = new Container(o);
		System.out.println(c.getObject().toString());
	}

}
