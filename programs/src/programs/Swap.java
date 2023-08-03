package programs;
import java.util.Scanner;
//Swapping without using 3rd variable
public class Swap {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st num: ");
		int a = scan.nextInt();
		System.out.println("Enter 2nd num: ");
		int b = scan.nextInt();//let a=10,b=20
		System.out.println("Before swapping: "+a+" "+b);
		b = a+b;//b=10+20=30
		a = b-a;//a=30-10=20
		b = b-a;//b=30-20=10
		System.out.println("After swapping: "+a+" "+b);
	}

}
