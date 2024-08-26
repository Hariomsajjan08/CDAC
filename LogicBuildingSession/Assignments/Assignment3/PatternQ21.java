public class PatternQ21
{
	public static void main(String[] args) {
		
		
// 		int row = 5;
		
		for (int i = 1; i <= 9 ; i+=2){
		    for (int j = 1 ; j <= i ; j +=2 ){
		        if ( j == 1){
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