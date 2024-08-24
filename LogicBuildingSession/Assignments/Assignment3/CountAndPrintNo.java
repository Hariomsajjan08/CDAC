import java.util.Scanner;
public class CountAndPrintNo{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a num: ");
		
		int num = sc.nextInt();
		
		int count =0;
		for (int i = num ; i >= 0; i--){
			System.out.println(i+" ");
			count += 1;
		}
		System.out.println("count is: "+count);
	}
}