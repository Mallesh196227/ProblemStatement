
class Animal
{
	void breath()
	{
		System.out.println("Animal is breathing");
	}
	void eat()
	{
		System.out.println("Animal is eating");
	}
	void sleep()
	{
		System.out.println("Animal is Sleeping");
	}

}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("Tiger Eats only Meat");
	}
	void run()
	{
		System.out.println("Tiger runs fastly");
	}
}

class Deer extends Animal
{
	void eat()
	{
		System.out.println("Deer eats Grass");
	}
	void jump()
	{
		System.out.println("Deer jumps very long");
	}
}

class Monkey extends Animal
{
	void eat()
	{
		System.out.println("Monkey eats banana");
	}
	void climb() 
	{
		System.out.println("Monkey climbs very easily");
	}
}



public class Inheritance1 {

	public static void main(String[] args) {
		Tiger ti = new Tiger();
		Deer d = new Deer();
		Monkey m = new Monkey();
		
		ti.breath();
		ti.eat();
		ti.sleep();
		ti.run();
		
		
		d.breath();
		d.eat();
		d.sleep();
		d.jump();
		
		
		m.breath();
		m.climb();
		m.sleep();
		m.eat();
	}

}
