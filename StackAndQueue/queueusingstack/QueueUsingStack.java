package StackAndQueue.queueusingstack;

public class QueueUsingStack {
    public static void main(String[] args) {
        QueueOperations queue1 = new QueueOperations();

        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);

        queue1.dequeue();
        queue1.enqueue(4);
        queue1.dequeue();
        queue1.peek();
        queue1.dequeue();
        queue1.dequeue();
        System.out.println(queue1.isEmpty());
    }
}
