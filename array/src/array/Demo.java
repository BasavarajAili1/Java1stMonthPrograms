package array;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of Rows(Number of games) and number of Columns(Number of players)");

		float [][]arr=new float[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter array elements: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter height of "+i+"th game "+j+"th player");
				arr[i][j]=scan.nextFloat();
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
