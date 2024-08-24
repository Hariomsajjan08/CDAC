
public class MultipleOfNumber{
	public static void main(String [] args){
		
		int num = 7;
		
		for ( int  i = 1 ; i <= 100 ; i++){
			if ( i % num == 0 || num / 10 == 7){
				System.out.println(i);
			}
		}
	}
}