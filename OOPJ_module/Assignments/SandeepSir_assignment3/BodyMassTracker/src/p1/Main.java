package p1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BmiTracker obj1 = new BmiTracker();
		
		obj1.acceptRecord();
		obj1.calculateBMI();
		obj1.classifyBMI();
		obj1.printRecord();
	}

}
