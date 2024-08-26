public class PatternQ22 {
    public static void main(String[] args) {
        int row = 5;

        
        for (int i = row; i >= 1; i--) {
            
            for (int s = 1; s <= (row - i); s++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       
        for (int i = 2; i <= row; i++) {
            
            for (int s = 1; s <= (row - i); s++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}