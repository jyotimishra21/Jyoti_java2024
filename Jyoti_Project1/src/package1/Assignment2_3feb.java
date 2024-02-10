package package1;

/*((((10/2)-2)+2)-2)/2)*/

public class Assignment2_3feb
{

	public float summ(float a, float b)
	{
		return(a+b);
	}
	public float subtractt(float c, float d)
	{
		return(c-d);
	}
	public float dividee(float g,float h)
	{
		return(g/h);

}
	public static void main(String args[])
	{
		Assignment2_3feb obj3=new Assignment2_3feb();
		float div=obj3.dividee(10,2);
		float sub=obj3.subtractt(div,2);
		float add=obj3.summ(sub,2);
		float sub1=obj3.subtractt(add,2);
		float div2=obj3.dividee(sub1,2);
		System.out.println("The Assignment2 value is "+div2);
	}
}
		
		
		
		