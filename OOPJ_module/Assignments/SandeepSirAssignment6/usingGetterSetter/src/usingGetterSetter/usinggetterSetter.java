package usingGetterSetter;



import java.util.Scanner;
class Array{
	
	private int[] arr;
	
	public Array (int size) {
		this.arr =new int [size];
	}
	

		

 
    public void setElement(int index, int value) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value;
        } else {
            System.out.println("Index out of bounds.");
        }
    }


    public int getElement(int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        } else {
            System.out.println("Index out of bounds.");
            return -1;
    }


    public void printArray() {
        System.out.println("This is your entered array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(getElement(i) + " ");
        }
    }
	
}



public class usinggetterSetter{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter size of array:   ");
		int size= sc.nextInt();
		Array a1 = new Array(size);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter an element for index " + i + ": ");
            int value = sc.nextInt();
            a1.setElement(i, value);
        }
        a1.printArray();
	
	}

}
