package tests;

/**
 * This tests dynamic dispatch resolution on an anonymous inner class.
 */
public class TestAnonymousInnerClass {

	public static void main(String[] args){
		System.out.println(new Object(){}.getClass());
	}
	
}
