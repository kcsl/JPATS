package tests.type;
/**
 * This tests autoboxing from a literal primitive char to a Character object
 * type
 * 
 * @author Ben Holland
 */
public class TestLiteralCharacterAutoboxing {

	public static void main(String[] args) {
		Object o = '1';
		System.out.println(o.getClass());
	}

}
