package tests.type;
import java.util.LinkedList;

/**
 * This tests the analysis handling of the semantics of a foreach loop over an
 * Iterable type
 * 
 * @author Ben Holland
 */
public class TestForEachIterable {

	static class Object1 {}

	public static void main(String[] args) {
		LinkedList<Object1> objects = new LinkedList<Object1>();
		objects.add(new Object1());
		for (Object o : objects) {
			System.out.println(o.getClass());
		}
	}

}
