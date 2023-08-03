package programs;

public class Ifelse {
	public static void main(String []args) {
		int row = 1;
		do 
		{
		    int col = 1;
		    do 
		    {
		        System.out.print(col + " ");
		        col++;
		    } 
		    while (col <= row);
		    System.out.println();
		    row++;
		} 
		while (row <= 5);
	}
}
