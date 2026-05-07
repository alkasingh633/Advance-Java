package CoreJava;


class Parent
{
	int noOfEyes = 2;
	void eyesColor() 
	{
		System.out.println("Eyes color is brown");	
	}
}

class Child extends Parent
{
	
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c  = new Child();
		System.out.println(c.noOfEyes);
//		c.eyesColor();

	}

}
