package tests;
/**
 * This tests type information through exceptional flows
 * 
 * @author Ben Holland
 */
public class TestCaughtException {

	static class MyThrowable extends Throwable {
		private static final long serialVersionUID = 1L;

		@Override
		public String toString(){
			return "TestCaughtException$MyThrowable$toString";
		}
	}
	
	public static void main(String[] args){
		try {
			throw new MyThrowable();
		} catch (Throwable t) {
			System.out.println(t.toString());
		}
	}
	
}
