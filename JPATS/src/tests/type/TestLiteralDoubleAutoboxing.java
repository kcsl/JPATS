package tests.type;
/**
 * This tests autoboxing from a literal primitive double to a Double object type
 * 
 * @author Ben Holland
 */
public class TestLiteralDoubleAutoboxing {

	public static void main(String[] args) {
		Object o = 1.0;
		System.out.println(o.getClass());
	}

}
