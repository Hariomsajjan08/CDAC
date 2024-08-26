public class PatternQ18 {
    public static void main(String[] args) {
        int row = 4;
        
        for (int i =1; i <= row; i++){
               
                for (int s = 1; s <= (row-i); s++){
                System.out.print(" ");
                } 
                for (int j = 1; j <= (i*2 - 1); j++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
        for (int i = row - 1; i >= 1; i--) {
            
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