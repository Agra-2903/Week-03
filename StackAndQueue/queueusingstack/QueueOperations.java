package StackAndQueue.queueusingstack;

import java.util.Stack;

public class QueueOperations {
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public QueueOperations(){
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    public void enqueue(int x){
        enqueueStack.push(x);
    }

    public void dequeue(){
        if(dequeueStack.isEmpty()){
            if(enqueueStack.isEmpty()){
                System.out.println("Queue is empty");
            }

            while(!enqueueStack.isEmpty()){
                dequeueStack.push(enqueueStack.pop());
            }
        }

        System.out.println(dequeueStack.pop());
    }

    public void peek(){
        if(dequeueStack.isEmpty()){
            if(enqueueStack.isEmpty()){
                System.out.println("Queue is empty");
            }

            while(!enqueueStack.isEmpty()){
                dequeueStack.push(enqueueStack.pop());
            }
        }

        System.out.println(dequeueStack.peek());
    }

    public boolean isEmpty(){
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }
}
