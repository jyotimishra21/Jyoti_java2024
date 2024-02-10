package package1;

public class constructor_4feb {

	public constructor_4feb() 
	{
		
		System.out.println("Default constructor");	
	}
	public constructor_4feb(int a) 
	{
		this();
		System.out.println("One parameterized constructor");	
	}
	public constructor_4feb(int a, int b) 
	{
		
		System.out.println("Two parameterized constructor");
		}
	public constructor_4feb(int a, int b, int c) 
	{
		
		System.out.println("Three parameterized constructor");
		}
	public constructor_4feb(int a, int b, int c, int d) 
	{
		
		System.out.println("Four parameterized constructor");
		}
public static void main(String args[])
{
	constructor_4feb obj3=new constructor_4feb(22,32,42);
	constructor_4feb obj1=new constructor_4feb(122);
	constructor_4feb obj2=new constructor_4feb(22,32);
	constructor_4feb obj4=new constructor_4feb(22,32,42,52);	
}
}
