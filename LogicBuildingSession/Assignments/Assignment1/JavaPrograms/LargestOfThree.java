class LargestOfThree {
	public static void main(String [] args){
		int a = 10;
		int b = 20;
		int c = 30;
		int max = a;
		
		if (b > max){
			max = b;
		}
		if ( c >  max){
			max = c;
		}

		System.out.println("the gretest of the thee numbers is " + max);
	}
}