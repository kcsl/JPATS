package tests;

import annotations.questions.PrintedType;
import annotations.sensitivities.ObjectSensitivity;

/**
 * This tests if the analyzer is sensitive to object instances
 * 
 * An analyzer that is not sensitive to object instances will conservatively
 * report two potential types (Object1 and Object2) when really only the Object1
 * type is possible at runtime.
 */
@ObjectSensitivity(k=2, rationale="A 1-object sensitive implementation will track unique instances for \"c1\" and \"c2\", but likely won't track Object1 and Object2 instances being stored in the fields of \"c1\" and \"c2\".")
@PrintedType
public class TestObjectInstanceSensitivity implements Test {

	static class Object1 {
		public Object1() {}
	}

	static class Object2 {
		public Object2() {}
	}

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
		
		// perform a useless operation on c2 so its not factored
		// out by the compiler for being unused
		c2.hashCode(); 
		
		System.out.println(c1.getObject().getClass());
	}

}
