import java.util.*;
public class LeapyearSwitch {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();

        int isleap;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            isleap = 1;
        }
        else{
            isleap = 0;
        }

        switch (isleap) {
            case 1:
                System.out.println(year + " is a leap year");
                break;
            case 0:
                System.out.println(year + " is not a leap year");
                break;
            default :
                System.out.println("Invalid year");
        }
    }
}
