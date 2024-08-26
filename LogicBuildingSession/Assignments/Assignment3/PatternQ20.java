public class PatternQ20
{
	public static void main(String[] args) {
		
		
		int row = 5;
		
		for (int i = row; i >0 ; i--){
		    for (int j = 5 ; j >= i ; j--){
		        if ( j >= 5){
		            System.out.print(j);
		        }
		        else{
		           System.out.print("*"+j); 
		        }
		        
		    }
		    System.out.println();
		}
	}
}