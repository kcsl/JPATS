package tests.type;
/**
 * This tests an analyzers ability to deal with Enums as types
 * 
 * Note: At the byte code level this test doesn't really test anything, but
 * analyzers dealing with source may have to have special handling for enum
 * semantics.
 * 
 * @author Ben Holland
 */
public class TestEnum {

	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}

	public static void main(String[] args) {
		Object o = Day.SUNDAY;
		System.out.println(o.getClass());
	}
}
