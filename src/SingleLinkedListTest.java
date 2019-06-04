import org.junit.Test;
import static org.junit.Assert.*;


public class SingleLinkedListTest {

    @Test
    public void testNodeConstructor(){

        Node<Integer> n = new Node<>(3);
        Node<String> n1 = new Node<>("hola");
        Node<Character> n2 = new Node<>('A');
        char x=n2.getValue();
        assertEquals(Integer.valueOf(3), n.getValue());
        assertEquals("hola", n1.getValue());
        assertEquals('A', x);
    }

//    @Test
//    public void testSLLCreation(){
//        SingleLinkedListImplementation sll1 = new SingleLinkedListImplementation();
//        SingleLinkedListImplementation sll2 = new SingleLinkedListImplementation();
//        SingleLinkedListImplementation sll3 = new SingleLinkedListImplementation();
//
//        assertEquals(3,SingleLinkedListImplementation.getCounterSLL());
//    }

    @Test
    public void testAddNode(){
        SingleLinkedListImplementation sll1 = new SingleLinkedListImplementation();
        sll1.add(2);
        sll1.add(4);
        sll1.add(6);
        sll1.add(8);
        assertEquals(4,sll1.getSize());
    }

//    @Test
//    public void testAddAtStart(){
//        SingleLinkedListImplementation sll = new SingleLinkedListImplementation();
//        sll.add(2);
//        sll.add(4);
//        sll.add(6);
//        sll.add(8);
//        sll.addAt(0,11);
//        assertEquals(sll.getAt(0),11);
//    }

    @Test
    public void testDelete(){

    }

    @Test
    public void testEditNode(){

    }

    @Test
    public void testPrintList(){

    }

    @Test
    public void testArrayToList(){
//        int[] arr = int[]{1,2,3,4};
//        SingleLinkedListImplementation sll = new SingleLinkedListImplementation(arr);
//        assertEquals(4,sll.getCounter());
    }

    @Test
    public void testVectorToList(){

    }

    @Test
    public void testStackToList(){

    }


}
