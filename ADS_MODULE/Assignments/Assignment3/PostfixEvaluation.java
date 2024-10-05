import java.util.Scanner;
public class PostfixEvaluation {

    public final int max = 100;
    int [] stack = new int[max];
    int top;

    PostfixEvaluation (){
        top = -1;
    }
    boolean isEmpty(){
        return (top < 0);
    }
    boolean isFull(){
        return (top == max-1);
    }

    void push (int d)
    {
        if (isFull()){
            return;
        }

        stack[++top] = d;
    }

     int pop(){
        if (isEmpty()){
            return -1;
        }
        return stack[top--];
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        PostfixEvaluation pf = new PostfixEvaluation();

        String expression = sc.nextLine();

        for (int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);

            if (Character.isDigit(ch))
            {
                pf.push(Character.getNumericValue(ch));
            }
            else {
                int b = pf.pop();
                int a = pf.pop();
                
                switch (ch) {
                    case '+':
                        pf.push(a + b);
                        break;
                    case '-':
                        pf.push(a -b);
                        break;
                    case '*':
                        pf.push(a * b);
                        break;
                    case '/':
                    if (b != 0) {
                        pf.push(a / b);
                    } else {
                        System.out.println("Error: Division by zero");
                        return;
                    }
                
                    default:
                        System.out.println("invalid operator");
                        break;
                }
            }
        }
        if (!pf.isEmpty()) {
            System.out.println("Result: " + pf.pop());
        } else {
            System.out.println("Error: No result to display. The expression may be invalid.");
        }
        
    }
}
