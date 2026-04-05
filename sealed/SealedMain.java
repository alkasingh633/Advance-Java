package sealed;



sealed class Shape permits Circle,Rectangle {
	
}

final class Circle extends Shape{
	
}
non-sealed class Rectangle extends Shape {
	
}

public class SealedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



