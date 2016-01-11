package tests.type;


/**
 * This tests if the analysis is path sensitive
 * 
 * An analysis that does path feasibility or symbolic execution should pass this
 * test. An analysis that is not path sensitive will conservatively report that
 * both Object1 and Object2 are possible, when really only Object2 is possible
 * at runtime.
 */
public class TestSwitchPathSensitivity_2 {

	static class Object1 {}

	static class Object2 {}

	static int i = 1;
	
	public static void main(String[] args) {
		Object o = new Object1();
		switch(i){
			case 0:
				o = new Object2();
				break;
			default:
				break;
		}
		System.out.println(o.getClass());
	}

}
