package CoreJava;

class A1
{
	void m1()
	{
		System.out.println("m1() method in class A");
	}
}
class B1 extends A1
{
		
	void m2(){
		{
			System.out.println("m1() method in class B" );
		}
	
}

public class Poly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = new A1();
		a1.m1();
	}

}
