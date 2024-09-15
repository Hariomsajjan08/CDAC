import java.util.*;

public class BmiIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight in kg:");
        float weight = sc.nextFloat();

        System.out.println("Enter your height in meters (m):");
        float height = sc.nextFloat();

        float bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi < 25) {
            System.out.println("You are normal weight.");
        } else if (bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}