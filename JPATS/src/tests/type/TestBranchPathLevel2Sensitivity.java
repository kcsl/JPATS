package tests.type;


/**
 * This tests if the analysis is path sensitive
 * 
 * An analysis that does path feasibility or symbolic execution should pass this
 * test. An analysis that is not path sensitive will conservatively report that
 * both Object1 and Object2 are possible, when really only Object2 is possible
 * at runtime.
 */
public class TestBranchPathLevel2Sensitivity {

	static class Object1 {}

	static class Object2 {}

	static int x = 1;
	static int y = 1;
	static boolean z = false;
	
	public static void main(String[] args) {
		Object o = new Object1();
		if (x == y) {
			z = true;	
		}
		if (z) {
			o = new Object2();
		}
		System.out.println(o.getClass());
	}

}
