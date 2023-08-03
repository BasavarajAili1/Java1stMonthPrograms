package programs;
import java.util.Scanner;

//Swap 2 numbers
public class Swapping {
	public static void main(String []args) {
		int c=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first num: ");
		int a = scan.nextInt();
		System.out.println("Enter the second num: ");
		int b = scan.nextInt();
		System.out.println("Before swapping: "+a+" "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping: "+a+" "+b);
	}

}
