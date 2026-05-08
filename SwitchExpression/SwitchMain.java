package SwitchExpression;

public class SwitchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,r;
		a=10;
		b= 20;
		enum c{Add, Sub, Mul, Div};
		r=switch (c.Add) {
		case Add -> a+b;
		case Sub -> a-b;
		case Mul -> a*b;
		case Div -> a/b;
		default -> -1;
		};
		System .out.println("Result = "+ r);
	}

}
