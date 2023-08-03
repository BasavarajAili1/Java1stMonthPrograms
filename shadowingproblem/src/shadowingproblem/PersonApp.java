package shadowingproblem;
import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ID: ");
		int id=scan.nextInt();
		System.out.println("Enter the name: ");
		scan.nextLine();
		String name=scan.nextLine();
		System.out.println("Enter the gender: ");
		String gender=scan.next();
		System.out.println("Enter the email: ");
		String email=scan.next();
		System.out.println("Enter the phone number: ");
		long phone=scan.nextLong();
		
		Person p=new Person(id,name,gender,email,phone);
		System.out.println(p.id+" "+p.name+" "+p.gender+" "+p.email+" "+p.phone);
	}

}
