package tests.type;
/**
 * Tests an array that stores a reference to itself
 * Credit to Jon Mathews and Tom Deering for example
 * 
 * @author Ben Holland
 */
public class TestArraySelfReference {

	public static void main(String[] args) {
		Object[] array = new Object[1];
		array[0] = (Object) array;
		
		Object[] unpacked = (Object[])array[0];
		// note: unpacked == array 
		
		System.out.println(unpacked.getClass());
	}

}
