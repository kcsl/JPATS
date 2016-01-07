package tests;
public class TestMethodParameters {

	static class Object1 {
		public Object1(){}
		
		@Override
		public String toString(){
			return "TestMethodParameters$Object1$toString";
		}
	}
	
	static class Object2 {
		public Object2(){}
		
		@Override
		public String toString(){
			return "TestMethodParameters$Object2$toString";
		}
	}
	
	static class Object3 {
		public Object3(){}
		
		@Override
		public String toString(){
			return "TestMethodParameters$Object3$toString";
		}
	}
	
	private static void printObject(Object o1, Object o2, Object o3){
		System.out.println(o2.toString());
	}
	
	public static void main(String[] args){
		Object o1 = new Object1();
		Object o2 = new Object2();
		Object o3 = new Object3();
		printObject(o1, o2, o3);
	}
	
}