package array;
import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[][]=new int[4][];
		arr[0]= new int[2];
		arr[1]= new int[4];
		arr[2]= new int[3];
		arr[3]= new int[2];
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter age of "+i+"th class "+j+"th student");
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array elements are..");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		scan.close();
	}
}