package tests.type;
/**
 * This tests type information propagated through exceptional flows
 * 
 * @author Ben Holland
 */
public class TestCaughtExceptionPropagation {

	static class MyThrowable extends Throwable {
		private static final long serialVersionUID = 1L;
	}
	
	public static void main(String[] args){
		try {
			throw new MyThrowable();
		} catch (Throwable t1) {
			try {
				throw t1;
			} catch (Throwable t2) {
				System.out.println(t2.getClass());
			}
		}
	}
	
}
