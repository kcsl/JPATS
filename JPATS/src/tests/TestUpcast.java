package tests;
/**
 * This tests if an analysis can handle explicit up casting
 * 
 * Note: There really is no reason this test should fail, unless the
 * implementation has an issue with the semantics of type casting.
 * 
 * @author Ben Holland
 */
public class TestUpcast {

	static class Object1 {
		@Override
		public String toString() {
			return "TestUpcast$Object1$toString";
		}
	}

	public static void main(String[] args) {
		Object object = (Object) new Object1();
		System.out.println(object.toString());
	}

}
