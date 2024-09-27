import java.util.Scanner;
public class GcdRec {

    static int gcd (int a , int b){
        if (b == 0){
            return a;
        }
        if (a == 0){
            return b;
        }

        int c = a % b;
        return gcd(b, c);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    
    }
}
