import java.util.Scanner;

public class SeasonUsingSwitch{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the month number");
            int month = sc.nextInt();

            switch (month) {
                case 3 ,4 ,5 : 
                    System.out.println("spring");
                    break;
                case 6 ,7 ,8 :
                    System.out.println("summer");
                    break;
                case 9 ,10 ,11:
                    System.out.println("autumn");
                    break;
                case 12 ,1 ,2:
                    System.out.println("winter");
                    break;
                default:
                    System.out.println("Invalid month");
            }
    }
}
