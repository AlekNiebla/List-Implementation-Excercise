public class Node<V> {

    private V value;
    public Node<V> next;

    public Node(){
        value=null;
        next=null;
    }

    public Node(V t){
        this.value=t;
        this.next=null;
    }

    public V getValue(){
        return this.value;
    }


    @Override
    public boolean equals(Object o){
        if(o == null) { return false; }
        if(!(o instanceof Node)){ return false; }

        Node other = (Node) o;
        return this.getValue() == other.getValue();
    }
}


