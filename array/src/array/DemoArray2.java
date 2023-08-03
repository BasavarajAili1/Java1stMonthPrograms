package array;
import java.util.Scanner;
public class DemoArray2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of persons..");
		//int per=scan.nextInt();
		boolean arr[]=new boolean[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the person "+i+"th marrital status as boolean");
			arr[i]=scan.nextBoolean();
		}
		for(int i=0;i<=arr.length-1;i++) 
		{
			System.out.println("Marrital Status of person "+i+" is "+arr[i]);
		}

	}

}
