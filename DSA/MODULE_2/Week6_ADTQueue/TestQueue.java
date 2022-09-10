package DSA.MODULE_2.Week6_ADTQueue;

public class TestQueue {
    public static void main(String args[]) {

        Queue q = new Queue(5);
        System.out.println("Empty\t: " + q.isEmpty());
        System.out.println("Full\t: " + q.isFull());

        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(20);

        System.out.print("Waiting on Queue\t: ");
        // System.out.println(q.display());
        System.out.println(q.display2());
        // System.println(q.display3());

        System.out.println("Now serving\t\t: " + q.dequeue());

        System.out.println("Waiting on Queue\t: ");
        // System.out.println(q.display());
        System.out.println(q.display2());
        // System.out.println(q.display3());

        System.out.println("Empty\t: " + q.isEmpty());
        System.out.println("Full\t: " + q.isFull());
    }
}
