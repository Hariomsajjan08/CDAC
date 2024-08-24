public class PatternQ14{
	public static void main(String [] args){
		int row = 9;
		
		for (int i = 1; i <= row; i++){
			
			for (int j = 1; j <= i; j++){
				
				if ( i %2 ==0 && i > 2){
					
					continue;
				}
				else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
