package tests.other;
/**
 * This tests if an analysis handles invalid casts
 * 
 * Some analyzers may take advantage of cast information as a context clue
 * (assuming the cast is always valid). If an analyzer detects that the cast in
 * this example is invalid then only the Object2 type should be inferred,
 * otherwise Object1 and Object2 types will be incorrectly inferred.
 * 
 * @author Ben Holland
 */
public class TestInvalidDowncast {

	static class Object1 {}

	static class Object2 {}

	public static Object getObject() {
		return new Object1();
	}

	public static void main(String[] args) {
		Object o;
		try {
			o = (Object2) getObject();
		} catch (ClassCastException e) {
			o = new Object2();
		}
		System.out.println(o.getClass());
	}

}
