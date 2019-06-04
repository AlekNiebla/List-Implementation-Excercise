import java.util.EmptyStackException;

import org.junit.Test;
import static org.junit.Assert.*;


public class StackImplementationTest {

    @Test
    public void testAssertPush() {
        StackImplementation myStack = new StackImplementation();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        assertEquals(4,myStack.getSize());
    }

    @Test
    public void testAssertPop() {
        StackImplementation myStack = new StackImplementation();
        myStack.push(5);
        assertEquals(5,myStack.pop());
        assertEquals(0,myStack.getSize());
    }


    @Test(expected= EmptyStackException.class)
    public void testAssertEmptyPop() {
        StackImplementation myStack = new StackImplementation();
        assertEquals(new EmptyStackException(), myStack.pop());
    }

    @Test
    public void getSize() {
        StackImplementation myStack = new StackImplementation();
        assertEquals(0,myStack.getSize());
        myStack.push(1);
        myStack.push(2);
        assertEquals(2,myStack.getSize());
        myStack.pop();
        myStack.pop();
        assertEquals(0,myStack.getSize());
    }

    @Test
    public void isEmpty() {
        StackImplementation myStack = new StackImplementation();
        assertEquals(true,myStack.isEmpty());
        myStack.push(1);
        assertEquals(false,myStack.isEmpty());
        myStack.pop();
        assertEquals(true,myStack.isEmpty());

    }
}