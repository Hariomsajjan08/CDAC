import java.util.Scanner;
class CalculateAreaOfSq {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the side of the squre in m");
		
		float side = sc.nextFloat();
		
		float area = side*side;

		System.out.println("area of the square is : " + area +"msq");
	}
}