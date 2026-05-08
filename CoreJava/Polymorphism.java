package CoreJava;

public class Polymorphism {
	
	void m1(int no1) 
	{
		System.out.println("No1 : "+ no1);
	}
	
	void m1(int no1, int no2)
	{
		System.out.println("Result : " + (no1 +no2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Polymorphism obj = new Polymorphism();
			obj.m1(10);
			obj.m1(10,20);
	}

}
