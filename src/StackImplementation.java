import java.util.EmptyStackException;
import java.util.List;

public class StackImplementation<V> implements MySingleLinkedList<V> {


    Node top = null;

    public StackImplementation() {
    }

    @Override
    public void push(V value) {
        Node<V> nextNode = new Node<>(value);
        nextNode.next = top;
        top = nextNode;
    }

    @Override
    public int pop() {

        if (top == null) {
            System.out.println("No nodes on stack");
            throw new EmptyStackException();
        }

        int value = (Integer)top.getValue();
        Node temp = top.next;
        top.next = null;
        top = temp;

        return value;
    }

    @Override
    public int getSize() {
        int size=0;
        Node iteration = top;
        while(iteration!=null){
            size++;
            iteration=iteration.next;
        }
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

//    public static void main(String[] args) {
//
//        StackImplementation myStack = new StackImplementation();
//
//        myStack.push(19);
//        myStack.push(28);
//        myStack.push(37);
//        myStack.push(46);
//        myStack.push(55);
//
//        System.out.println("The size of the stack is: " + myStack.getSize());
////
////        myStack.pop();
////        myStack.pop();
////
////        System.out.println("The size of the stack is: "+myStack.getSize());
////
////        myStack.push(91);
////
////        System.out.println("The size of the stack is: "+myStack.getSize());
//
//
//        System.out.println("The popped value is: " + myStack.pop());
//        System.out.println("The popped value is: " + myStack.pop());
//        System.out.println("The popped value is: " + myStack.pop());
//        System.out.println("The popped value is: " + myStack.pop());
//        System.out.println("The popped value is: " + myStack.pop());
//
//        System.out.println("The size of the stack is: " + myStack.getSize());
//
//        String message = myStack.isEmpty() ? "The stack is empty" : "The Stack is NOT empty";
//        System.out.println(message);
//    }

}
