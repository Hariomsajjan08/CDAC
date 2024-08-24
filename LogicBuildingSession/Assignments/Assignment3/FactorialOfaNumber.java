import java.util.Scanner;
public class FactorialOfaNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to calculate factorial");
		
		int num = sc.nextInt();
		int factorial =1;
		for (int i = num; i >0; i--){
			factorial *= i;
		}
		System.out.println("factorial of a number "+ num+ "is "+factorial );
	}
}