import java.util.*;

public class StackUsingArray {
    static final int MAX = 10;
    int top;
    int arr[] = new int[MAX];

    StackUsingArray() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    // Insertion in the stack
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack overflow");
            return false;
        }
        arr[++top] = x;
        return true;
    }

    // Deletion in the stack
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        }
        return arr[top--];
    }

    // Top of the stack
    int peek() {
        return (top < 0) ? 0 : arr[top];
    }

    void displayAll() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingArray s1 = new StackUsingArray();

        while (true) {
            System.out.println("\nStack operations:");
            System.out.println("0. Exit");
            System.out.println("1. Push element into Stack");
            System.out.println("2. Pop element from Stack");
            System.out.println("3. Peek element");
            System.out.println("4. Display all elements");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                case 1:
                    System.out.println("Enter element to push:");
                    int ele = sc.nextInt();
                    s1.push(ele);
                    break;
                case 2:
                    System.out.println("Popped element: " + s1.pop());
                    break;
                case 3:
                    System.out.println("Top element: " + s1.peek());
                    break;
                case 4:
                    s1.displayAll();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
