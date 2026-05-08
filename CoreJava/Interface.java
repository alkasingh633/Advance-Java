package CoreJava;


interface Animal
{
	void eat();
}
class Dog implements Animal
{
	@Override
	public void eat()
	{
		System.out.println("dog is eating");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Dog buzo = new Dog();
     buzo.eat();
	}

}
