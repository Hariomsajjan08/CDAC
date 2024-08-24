import java.util.Scanner;
public class EvenNoInRange{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 0 ; i <= num; i = i+2){
			System.out.println(i);
		}
	}
}