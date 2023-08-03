package programs;
import java.util.Scanner;
public class Rect {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in); //Scanner object
		System.out.println("Please enter the lenght: ");
		int l = scan.nextInt();
		System.out.println("Please enter the width: ");
		int b = scan.nextInt();
		Rectangle r1= new Rectangle();
		r1.areaOfRectangle(l,b);
	}
	
	
}
