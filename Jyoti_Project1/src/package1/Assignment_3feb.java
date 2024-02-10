package package1;

/*((((10+2)+2)-2)*2)/2) */

public class Assignment_3feb {

	public int sum(int a, int b)
	{
		return(a+b);
	}
	public int subtract(int c, int d)
	{
		return(c-d);
	}
	public int multiply(int e, int f)
	{
		return(e*f);	
	}
	public int divide(int g,int h)
	{
		return(g/h);
	}
public static void main(String args[])
{
	Assignment_3feb obj2=new Assignment_3feb();
	int sum1=obj2.sum(10,2);
	int sum2=obj2.sum(sum1,2);
	int subtract1=obj2.subtract(sum2, 2);
	int multiply2=obj2.multiply(subtract1,2);
	int divide2=obj2.divide(multiply2,2);
	System.out.println("The answer value of Assignment 1 is: "+ divide2);
}
}