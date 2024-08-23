import java.util.Scanner;
class positiveNumber {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("the given number is positive");		
		}
		else if (num < 0){
			System.out.println("the given number is negative");
		}
		else {
			System.out.println("the given number is zero");		
		}
	}
}