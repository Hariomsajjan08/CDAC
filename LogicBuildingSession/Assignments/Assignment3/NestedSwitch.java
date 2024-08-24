import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter department: ");
        String department = sc.nextLine();
		
        System.out.print("Enter student ID: ");
        int stdId = sc.nextInt();
        
        

        switch (stdId) {
            case 101:
                switch (department) {
                    case "cse":
                        System.out.println("This is ID 101 and dept CSE");
                        break;
                    case "it":
                        System.out.println("This is ID 101 and dept IT");
                        break;
                    default:
                        System.out.println("Department not recognized for ID 101");
                        break;
                }
                break;
            case 102:
                switch (department) {
                    case "cse":
                        System.out.println("This is ID 102 and dept CSE");
                        break;
                    case "it":
                        System.out.println("This is ID 102 and dept IT");
                        break;
                    default:
                        System.out.println("Department not recognized for ID 102");
                        break;
                }
                break;
            default:
                System.out.println("Student ID not recognized");
                break;
        }
    }
}
