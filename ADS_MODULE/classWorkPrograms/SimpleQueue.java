import java.util.Arrays;

class Queue {
    int size = 5;
    int arr[] = new int[size];
    int front, rear;

    Queue() {
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return (front == -1);
    }

    boolean isFull() {
        return (rear == size - 1);
    }

    void enque(int ele) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) { 
            front = 0;
        }
        arr[++rear] = ele;
    }

    void deque() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int dequeuedElement = arr[front];
        if (front >= rear) { 
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        System.out.println("Dequeued: " + dequeuedElement);
    }

    void display()
    {
        System.out.print("Queue: "+Arrays.toString(arr));
    }
}

public class SimpleQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        

        q.enque(1);
        q.enque(2);

        q.deque();
        q.display();

  
    }
}
