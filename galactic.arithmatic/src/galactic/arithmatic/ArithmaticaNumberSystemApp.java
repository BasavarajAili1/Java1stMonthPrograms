package galactic.arithmatic;
import java.util.Scanner;
public class ArithmaticaNumberSystemApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		System.out.println(ArithmaticaNumberSystem.galacticAddition(num1,num2));
		scan.close();
	}

}
