import java.util.Scanner;
public class ReverseofNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to be reverse");
		int num = sc.nextInt();
		
		int reverse = 0;
		
		
		while(num > 0){
			int remainder = num% 10;
			num = num /10;
			reverse = reverse * 10 + remainder;
		}
		
		System.out.println("reverse of a number is : "+reverse);
	}
}