public class PatternQ17 {
    public static void main(String[] args) {
        int row = 5;
        
        for (int i =row; i > 0; i--){
            if (i < 5){
                for (int s = 1; s <= (row-i); s++){
                System.out.print(" ");
                }
            
            }
            
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
    }
}