package tests.type;
/**
 * This tests if the analysis is path sensitive and propagates type information
 * along sensitive paths
 * 
 * @author Ben Holland
 */
public class TestPathSensitivityPropagation {

	static class Object1 {}

	static class Object2 {}

	static class Object3 {}

	public static void main(String[] args) {
		Object o = new Object1();
		if (o.getClass() == Object1.class) {
			o = new Object2();
		}
		if (o.getClass() == Object2.class) {
			o = new Object3();
		}
		System.out.println(o.getClass());
	}

}
