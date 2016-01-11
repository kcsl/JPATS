package tests.type;
/**
 * This tests if the analyzer propagates type information along to object
 * sensitive instances
 * 
 * @author Ben Holland
 */
public class TestObjectInstanceSensitivityPropagation {

	static class Object1 {}

	static class Object2 {}

	static class Container {
		Object o;

		public Container(Object o) {
			this.o = o;
		}

		public Object getObject() {
			return o;
		}
	}

	public static void main(String[] args) {
		Container c1 = new Container(new Object1());
		Container c2 = new Container(new Object2());
		Container c3 = new Container(c1);
		Container c4 = new Container(c2);

		c4.hashCode(); // just some filler operation on c2 so its not factored
					   // out by the compiler as unused

		// unpack container
		Container c5 = (Container) c3.getObject();
		System.out.println(c5.getObject().getClass());
	}

}
