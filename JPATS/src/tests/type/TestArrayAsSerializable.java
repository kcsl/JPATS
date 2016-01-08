package tests.type;
import java.io.Serializable;

/**
 * This tests type propagation through an array treated as a Serializable 
 *
 * @author Ben Holland
 */
public class TestArrayAsSerializable {

	static class Object1 {
		public Object1(){}
	}
	
	public static void main(String[] args) {
		Object[] a1 = new Object[1];
		a1[0] = new Object1();
		Serializable a2 = a1;
		Object o = ((Object[]) a2)[0];
		System.out.println(o.getClass());
	}

}
