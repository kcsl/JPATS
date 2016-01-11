package tests.type;
/**
 * This tests autoboxing from a literal primitive byte to a Byte object type
 * 
 * @author Ben Holland
 */
public class TestLiteralByteAutoboxing {

	public static void main(String[] args) {
		Object o = (byte) 1;
		System.out.println(o.getClass());
	}

}
