package tests;
/**
 * This tests if the analysis is path sensitive and propagates type information
 * along sensitive paths
 * 
 * @author Ben Holland
 */
public class TestPathSensitivityPropagation {

	static class Object1 {
		public Object1() {}

		@Override
		public String toString() {
			return "TestPathSensitivityPropagation$Object1$toString";
		}
	}

	static class Object2 {
		public Object2() {}

		@Override
		public String toString() {
			return "TestPathSensitivityPropagation$Object2$toString";
		}
	}

	static class Object3 {
		public Object3() {}

		@Override
		public String toString() {
			return "TestPathSensitivityPropagation$Object3$toString";
		}
	}

	public static void main(String[] args) {
		Object o = new Object1();
		if (o.getClass() == Object1.class) {
			o = new Object2();
		}
		if (o.getClass() == Object2.class) {
			o = new Object3();
		}
		System.out.println(o.toString());
	}

}
