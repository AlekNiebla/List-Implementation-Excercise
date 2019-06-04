import java.awt.*;
import java.util.List;

public class SingleLinkedListImplementation<V> {

    private int size=0;
    private static int counterSLL=0;
    Node head;
    Node tail;

    public SingleLinkedListImplementation(){
         head = null;
         tail = null;
         countSLL(); //purely for testing purposes
    }

    public void add(V value){
        Node newNode = new Node(value);
        if(head == null){
            tail=newNode;
            head=tail;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        count();
    }

    public void deleteAt(){
        
    }

    public void addAt(int index, V value){

    }

    public V getAt(int index){
        return null;
    }

    public V getLastNode(){
        return (V) tail.getValue();
    }

    public void printSLL(){
        Node pointer = head;
        while(pointer!=null){
            System.out.print(pointer.getValue()+", ");
            pointer=pointer.next;
        }
        System.out.println("END");
    }



    private void count(){ size++; }

    private static void countSLL(){ counterSLL++; }

    public int getSize(){ return size; }

    public static int getCounterSLL(){ return counterSLL; }


}
