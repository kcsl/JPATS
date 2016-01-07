package tests;
/**
 * This tests simple local array access to a multi-dimensional array component
 * 
 * @author Ben Holland
 */
public class TestDoubleArrayAccess {

	static class Object1 {
		public Object1(){}
		
		@Override
		public String toString(){
			return "TestDoubleArrayAccess$Object1$toString";
		}
	}
	
	public static void main(String[] args) {
		Object[][] a = new Object[1][1];
		a[0][0] = new Object1();
		System.out.println(a[0][0].toString());
	}

}
