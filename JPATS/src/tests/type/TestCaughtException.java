package tests.type;
/**
 * This tests type information through exceptional flows
 * 
 * @author Ben Holland
 */
public class TestCaughtException {

	static class MyThrowable extends Throwable {
		private static final long serialVersionUID = 1L;
	}
	
	public static void main(String[] args){
		try {
			throw new MyThrowable();
		} catch (Throwable t) {
			System.out.println(t.getClass());
		}
	}
	
}
