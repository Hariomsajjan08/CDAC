import java.util.Scanner;
class largestNumber {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number a");
		int a = sc.nextInt();
		System.out.println("enter the second number b");
		int b = sc.nextInt();
		System.out.println("Enter the third number c");
		int c = sc.nextInt();
		
		if ( a > b) {
			if ( a > c){
				System.out.println("The largest number is a = " +a);
			}
			else {
				System.out.println("The largest number is c =" +c);
			}
		}
		else if ( b > c ){
			System.out.println("The largest number is b =" +b);
		}
		else{
			System.out.println("The largest number is c =" +c);
		}
	}
}
