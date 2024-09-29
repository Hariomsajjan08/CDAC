class Dequeue{
	int size = 5;
	int dq = new int[size];
	int rear, front;
	
	Dequeue (){
		rear =0;
		front = -1;
	}
	
	boolean isEmpty(){
		return (front == -1);
	}
	boolean isFull(){
		return ((front == 0 && rear == size -1) || front = rear + 1);
	}
	
	void insertInFront (int ele){
		if (isFull){
			System.out.println("queue is full);
			return;
		}
		
		// If queue is initially empty
		if (front == -1){
			front =0;
			rear = 0;
		}
		
		// Front is at the first position of the array
        else if (front == 0)
            front = size - 1;

        else
            front = front - 1;

        dq[front] = ele;
    }
	}
	
	void insertAtLast(int ele){
		if (isFull()) {
            System.out.println("Overflow");
            return;
        }

        // If queue is initially empty
        if (front == -1) {
            front = 0;
            rear = 0;
        }

        // Rear is at the last position of the array
        else if (rear == size - 1)
            rear = 0;

        else
            rear = rear + 1;

        DQ[rear] = key;
    }
	}
}

public class DoubleEndedQueue{
	public static void main (String [] args){
		
	}
}