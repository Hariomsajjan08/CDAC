import java.util.Scanner;
public class LargestDigitInNo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int max = 0;
		while (num > 0){
			int largest = num % 10;
			num = num /10;
			if ( largest > max){
				max = largest;
			} 
			
		}
		System.out.println("largets digit in the number is : "+max);
	}
}