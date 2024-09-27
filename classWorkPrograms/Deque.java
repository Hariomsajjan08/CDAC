 public class Deque {
    int size = 5;
    int dq[] = new int[size];
    int front,rear;

    Deque (){
        front = -1;
        rear = 0;
    }

    boolean isEmpty (){
        return(front == -1);
    }

    boolean isFull (){
        return ((front == 0 && rear == size-1) || front == rear +1);
    }

   void insertFront (int key ) {
        if (isFull()){
            System.out.println("overflow");
            return;
        }
// first element inserted
        if (front == -1) {
            front =0;
            rear=0;
        }
        else if (front == 0){
                front = size -1;
        }
        else {
            front = front -1;
        }
        dq[front]= key;

   }

   void insertRear (int key){
        if(isFull()){
            System.out.println("full");
            return;
        }

        if (front == -1){
            front = 0;
            rear = 0;
        }
        else if (rear == size -1)
            rear =0;
        else 
            rear = rear +1;

        dq[rear] = key;

   }

   void deleteFromt(){
        if (isEmpty()) {
            System.out.println("EMPTY");
            return;
        }
        if (front == rear){
            front = -1;
            rear = -1;
        }
        else if (front == size-1) {
            front=0;
        
        }
        else   {
            front = front +1;
        }
   }

   void deleteRear (){
        if (isEmpty()) {
            System.out.println("EMPTY");
            return;
        }
        if (front == rear){
            front = -1;
            rear = -1;

        }
        else if (rear == 0){
            rear = size -1;
        }
        else{
            rear = rear +1;
        }
   }

   int getfront(){
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        return dq[front];
   }
   int getRear(){
    if (isEmpty() || rear < 0) {
        System.out.println("Empty");
        return -1;
    }
    return dq[rear];
    }

    public static void main(String [] args){
        
    }
}
