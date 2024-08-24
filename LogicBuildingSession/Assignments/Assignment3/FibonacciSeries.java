import java.util.Scanner;
public class FibonacciSeries{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number uto you want series: ");
		int max = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		while( c <= max){
			
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
			
		}
	}
}