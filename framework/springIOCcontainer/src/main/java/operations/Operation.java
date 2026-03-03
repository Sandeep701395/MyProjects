package operations;

public class Operation {

	public int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public void sub(int x,int y)
	{
		System.out.println("Subtraction is: "+(x-y));
	}
	
	public double mul(int a,double b)
	{
		return a*b;
	}
	
	public int div(int r,int s)
	{
		int d=r/s;
		return d;
	}
}
