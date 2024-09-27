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

    int deque() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeuedElement = arr[front];
        if (front >= rear) { 
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        System.out.println("Dequeued: " + dequeuedElement);
        return dequeuedElement;
    }
}

public class SimpleQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());

        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        q.enque(6);

        q.deque();
        q.deque();
        q.deque();
        q.deque();
        q.deque();
        q.deque();
    }
}
