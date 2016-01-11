package tests.type;
import java.util.HashMap;

/**
 * This tests the capability of an analysis to include or summarize behavior in
 * a runtime library to infer flows into an out of a map object which returns a
 * generic Object type by default.
 */
public class TestWholeProgramAnalysis {

	static class Object1 {
		public Object1() {}
	}

	public static void main(String[] args) {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put("key", new Object1());
		Object object = map.get("key");
		System.out.println(object.getClass());
	}

}
