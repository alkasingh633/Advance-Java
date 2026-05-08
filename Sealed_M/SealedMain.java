package Sealed_M;

sealed class Human permits Alka, Shivi
{
	public void info()
	{
		System.out.println("Human Class");
	}
}
non-sealed class Alka extends Human
{
	public void info()
	{
		System.out.println("Hi Friends I am Alka");
	}
}

non-sealed class Shivi extends Human
{
	public void info() {
		System.out.println("hi friend i am shivi");
	}
}

public class SealedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Alka();
		Human h2 = new Shivi();
		h1.info();
		h2.info();
	}

}
