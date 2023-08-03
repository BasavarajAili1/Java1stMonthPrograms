package programs;
import java.util.Scanner;
public class SquaringNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number to be squared: ");
		int num=scan.nextInt();
		System.out.println(SquaringNum.squareNumber(num));
		scan.close();
	}

}
