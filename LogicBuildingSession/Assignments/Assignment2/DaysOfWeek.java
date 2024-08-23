import java.util.Scanner;
public class DaysOfWeek{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the day of a week");
		int day = sc.nextInt();
		
		switch (day){
			case 1:
			System.out.println("it is a Monday");
			break;
			case 2:
			System.out.println("it is a tuesday");
			break;
			case 3:
			System.out.println("it is a wednesday");
			break;
			case 4:
			System.out.println("it is a thursday");
			break;
			case 5:
			System.out.println("it is a friday");
			break;
			case 6:
			System.out.println("it is a saturday");
			break;
			case 7:
			System.out.println("it is a sunday");
			break;
			default:
			System.out.println("invalid day");
		}
		
	}
}