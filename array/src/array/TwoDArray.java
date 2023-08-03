package array;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [][]arr=new int[2][5];
		System.out.println("Enter array elements: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print("Enter marks of "+i+"th class "+j+"th student");
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
		
	}

}
