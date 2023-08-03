package codes.New1;

public class Calc {
	public static void main(String []args) {
		int a=2;
		int b=10;
		int c=2;
		add2(a, b);
		add3(a,b,c);
		sub2(a,b);
		mul2(a,b);
		mul3(a,b,c);
		div2(a,b);
		
	}
	
	public static void add2(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public static void add3(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	
	public static void sub2(int b,int a)
	{
		int p=a-b;
		System.out.println(p);
	}
	
	public static void sub3(int a,int b,int c)
	{
		int m=a-b-c;
		System.out.println(m);
	}
	
	public static void mul2(int a,int b)
	{
		int e=a*b;
		System.out.println(e);
	}
	
	public static void mul3(int a,int b, int c)
	{
		int e=a*b*c;
		System.out.println(e);
	}
	
	public static void div2(int b,int a)
	{
		int e=a/b;
		System.out.println(e);
	}

}
