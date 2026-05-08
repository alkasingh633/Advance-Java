package SwitchExpression;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj=10;
		String r = switch(obj) {
		case Integer i->"Integer Value";
		case String s >"String value";
		default -> "Unknown";
		};
		 System.out.println(r);
	}

}
