package tests;
/**
 * This tests autoboxing from a literal primitive short to a Short object type
 * 
 * @author Ben Holland
 */
public class TestLiteralShortAutoboxing {

	public static void main(String[] args) {
		Object o = (short) 1;
		System.out.println(o.toString());
	}

}
