package CoreJava;



public class Poly1 {
	
	void m1(int no1) 
	{
		System.out.println("No1 : "+ no1);
	}
	
	void m1(String str1)
	{
		System.out.println("String : " + str1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Poly1 obj = new Poly1();
			obj.m1(10);
			obj.m1("alka");
	}

}

