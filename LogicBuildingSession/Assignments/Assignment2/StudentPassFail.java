import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks for subject 1: ");
        int marks1 = sc.nextInt();

        System.out.print("Enter the marks for subject 2: ");
        int marks2 = sc.nextInt();

        System.out.print("Enter the marks for subject 3: ");
        int marks3 = sc.nextInt();

        int noOfSubjectsFailed = 0;

        int subject1 = (marks1 > 40) ? 1 : 0;
        int subject2 = (marks2 > 40) ? 1 : 0;
        int subject3 = (marks3 > 40) ? 1 : 0;

        switch (subject1) {
            case 0:
                noOfSubjectsFailed++;
            case 1:
                switch (subject2) {
                    case 0:
                        noOfSubjectsFailed++;
                    case 1:
                        switch (subject3) {
                            case 0:
                                noOfSubjectsFailed++;
                                break;
                            case 1:
                                break;
                        }
                        break;
                }
                break;
        }

        if (noOfSubjectsFailed == 0) {
            System.out.println("The student passes");
        } else {
            System.out.println("The student fails in " + noOfSubjectsFailed + " subjects");
        }

        sc.close();
    }
}