
import java.util.Scanner;

public class CheckLeapYear {
    public static void main (String [] hari){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the leap year");

        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println("it is not the leap year");
        }
        sc.close();
    }
}
