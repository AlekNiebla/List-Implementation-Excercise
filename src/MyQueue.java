public interface MyQueue {

    void Enqueue(int v);

    int Dequeue();

    int getFrontItem();

    int getRearItem();

    int getSize();
}
