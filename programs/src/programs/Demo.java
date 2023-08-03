package programs;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the nym between 1-7");
		int num=scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("Super Sunday");
			break;
		case 2:
			System.out.println("Fresh Monday");
			break;
		case 3:
			System.out.println("Boring Tuesday");
			break;
		case 4:
			System.out.println("Moderate Wednesday");
			break;
		case 5:
			System.out.println("Good Thursday");
			break;
		case 6:
			System.out.println("Good Friday");
			break;
		case 7:
			System.out.println("Happy Saturday");
			break;
		default:
			System.out.println("See the message correctly");
		}

	}

}
