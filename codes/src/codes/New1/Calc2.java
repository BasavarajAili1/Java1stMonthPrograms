package codes.New1;

public class Calc2 {
	public static void main(String []args) {
		int a=20;
		int b=10;
		int c=2;
		getAdd(a,b);
		getAdd(a,b,c);
		getSum(a,b);
		getSum(a,b,c);
		getMul(a,b);
		getDiv(a,c);
	}
	
	public static void getAdd(int a, int b) 
	{
		System.out.println(a+b);
	}
	public static void getAdd(int a,int b, int c) 
	{
		System.out.println(a+b+c);
	}
	
	public static void getSum(int a, int b) 
	{
		System.out.println(a-b);
	}
	public static void getSum(int a, int b, int c) 
	{
		System.out.println(a-b-c);
	}
	
	public static void getMul(int a, int b) 
	{
		System.out.println(a*b);
	}
	
	public static void getDiv(int a, int c) 
	{
		System.out.println(a/c);
	}
}
