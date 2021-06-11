package DayJune11;
class Demo 
{
	private String name;
	private int version;
	
	void setName(String x) 
	{
		name = x;
	}
	void setVersion(int y)
	{
		version = y;
	}
	String getName()
	{
		return name;
	}
	int getVersion()
	{
		return version;
	}
}

class Demo2
{
	private String name;
	private int version;
	private int price;
	
	void setName(String a) 
	{
		name = a;
	}
	void setVersion(int b) 
	{
		version = b;	
	}
	void setPrice(int c) 
	{
		price = c;
	}	
		
	
	
	String getName() 
	{
		return name;
	}
	int getVersion()
	{
		return version;
	}
	int getPrice()
	{
		return price;
	}
}
public class Encapsulaton1 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		d1.setName("Samsung");
		d1.setVersion(10);
		
		Demo2 d2 = new Demo2();
		d2.setName("OnePlus");
		d2.setVersion(9);
		d2.setPrice(25000);
		
		
		System.out.println(d1.getName());
		System.out.println(d1.getVersion());
		
		
		System.out.println(d2.getName());
		System.out.println(d2.getVersion());
		System.out.println(d2.getPrice());
	}
}

