package tests.type;
/**
 * This tests autoboxing from a literal primitive boolean to a Boolean object
 * type
 * 
 * @author Ben Holland
 */
public class TestLiteralBooleanAutoboxing {

	public static void main(String[] args){
		Object o = true;
		System.out.println(o.getClass());
	}
	
}
