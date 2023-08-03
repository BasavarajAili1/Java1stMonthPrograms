package programs;
import java.util.Scanner;
public class Diff {
	public static void main(String []args) {
		int res;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the first number:");
		int a=scan.nextInt();
		System.out.println("Please enter the second number:");
		int b=scan.nextInt();
		if (a>b)
		{
			res=a-b;
			System.out.println("First number is greater than Second number");
			System.out.println("Difference is: "+res);
		}
		else
		{
			res=b-a;
			System.out.println("First number is smaller than Second number");
			System.out.println("Difference is: "+res);
		}
	}
}
