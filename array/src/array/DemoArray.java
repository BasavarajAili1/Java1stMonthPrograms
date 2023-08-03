package array;
import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float arr[]=new float[7];
		System.out.println("Enter the array elemets");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the height of player "+i);
			arr[i]=scan.nextFloat();
		}
		System.out.println("Array elemets are:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}

}
