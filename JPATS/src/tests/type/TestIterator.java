package tests.type;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * This tests the analysis handling of iterators in a while loop
 * 
 * @author Ben Holland
 */
public class TestIterator {

	static class Object1 {}

	public static void main(String[] args) {
		LinkedList<Object1> objects = new LinkedList<Object1>();
		objects.add(new Object1());
		Iterator<Object1> iter = objects.iterator();
		while(iter.hasNext()) {
			Object o = iter.next();
			System.out.println(o.getClass());
		}
	}

}
