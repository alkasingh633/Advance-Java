package SwitchExpression;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a,b,r;
		String day = "Wed";
		String r = switch (day) {
		case "Mon", "Tue", "Wed", "Thu","Fri"->"Working Day";
		case "Sat", "Sun" -> "Non Working Day";
		default -> "Invalid Day Name";
		};
		System.out.println("Day type -" +r);
		
	}

}
