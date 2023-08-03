package codes.New1;
import java.util.Scanner;
public class DisneyChai {
	public static void main(String []args) {
		getTea();
		getTea(10);
		getTea("Lemon");
		getTea(5, "Ginger");
	}
	
	public static void getTea() 
	{
		System.out.println("Bill for 1 Tea is 10Rs");
	}
	
	public static void getTea(int quantity) 
	{
		System.out.println("Bill for"+" "+ quantity +"Teas is"+" "+ (quantity*10));
	}
	
	public static void getTea(String type) 
	{
		System.out.println("Bill for 1" + type + "Tea is 15Rs");
	}
	
	public static void getTea(int quantity, String type) 
	{
		System.out.println("Bill for "+ quantity + type +"Teas is"+ (quantity*15));
	}

}
