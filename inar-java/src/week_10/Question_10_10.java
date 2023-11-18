package week_10;

public class Question_10_10 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i <= 20; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue);
        System.out.println("Process Of Dequeue");
        while(!queue.empty()){
            System.out.println(queue.dequeue() + " ");
        }
    }
}
