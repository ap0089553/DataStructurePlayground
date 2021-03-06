package ds.java;

public class BasicQueue<X> implements Queue<X> {
    private final X[] data;
    private int front;
    private int rear;

    public BasicQueue() {
        this.data = (X[]) new Object[1000];
        this.front = -1;
        this.rear = -1;
    }

    @Override
    public void enqueue(X x) {
        if ((rear + 1) % data.length == front) {
            throw new IllegalStateException("Queue is Full");
        } else if (size() == 0) {
            front++;
            rear++;
            data[rear] = x;
        } else {
            data[++rear] = x;
        }
    }

    @Override
    public X dequeue() {
        if (size() == 0) {
            throw new IllegalStateException("Queue is empty");
        } else if (front == rear) {
            X element = data[front];
            data[front] = null;
            front = -1;
            rear = -1;
            return element;
        } else {
            X element = data[front];
            data[front++] = null;
            return element;
        }
    }

    @Override
    public int size() {
        if (front == -1 && rear == -1) {
            return 0;
        } else {
            return rear - front + 1;
        }
    }

    @Override
    public boolean contains(X x) {
        if (size() == 0) {
            return false;
        }
        for (int i = front; i <= rear; i++) {
            if (data[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public X access(int position) {
        if (size() == 0 || position > size()) {
            throw new IllegalStateException("Queue is empty or position is greater that queue size");
        }

        for (int i = front; i <= rear; i++) {
            X element = dequeue();
            if (i == position) {
                return element;
            }
        }
        throw new IllegalArgumentException("Could not get queue element at position" + position);
    }
}
