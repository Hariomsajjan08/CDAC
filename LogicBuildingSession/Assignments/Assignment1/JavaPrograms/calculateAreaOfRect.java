import java.util.Scanner;
class calculateAreaOfRect {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of the REctangle in m");

		float length = sc.nextFloat();
		
		System.out.println("Enter the width of the REctangle in m");
		
		float width = sc.nextFloat();
		float area = length*width;

		System.out.println("area of the reactangle is"+ area + "msq");
	}
}
