public class TowerOfHanoi {

    public static void toh(int n, char s, char inter, char d) {
       if (n == 1) {
          System.out.println("source disk " + s + " to destination " + d);
       } else {
          toh(n - 1, s, d, inter);
          System.out.println("source disk " + s + " to destination " + d);
          toh(n - 1, inter, s, d);
       }
 
    }
 
    public static void main(String[] var0) {
       byte n = 3;
       toh(n,'A', 'B','C');
    }
 }