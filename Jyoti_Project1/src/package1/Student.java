package package1;

public class Student {

	int rollNo;
	int Age;
	
	public void display1() 
	{
		System.out.println("****Welcome to all of you!****");
	}
	public void display2()
	{
		System.out.println("****Automation is very easy****");
	}

public static void main(String args[])
{
	Student obj1=new Student();
	obj1.display1();
	obj1.display2();
	System.out.println("The Student rollNo is:"+101);
	System.out.println("The Student Age is:"+15);
}
}
