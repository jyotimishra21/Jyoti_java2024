package package1;

public class method_4feb {

	public void m1()
	{
		System.out.println("Default method");
	}
	public void m2(int a)
	{
		this.m1();
		System.out.println("One parameterized method");
	}
	public void m3(int a, int b)
	{
		System.out.println("Two parameterized method");
	}
	public void m4(int a, int b, int c)
	{
		System.out.println("Three parameterized method");
	}
	public void m5(int a, int b, int c, int d)
	{
		System.out.println("Four parameterized method");
	}
	public static void main(String args[])
	{
		method_4feb ob=new method_4feb();
		ob.m4(10,20,30);
		ob.m5(10, 20, 30,40);
		ob.m2(42);
		ob.m3(66, 22);
}
}
