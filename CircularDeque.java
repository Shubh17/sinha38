//implement circular deque here

//create necessary variables and methods
public class CircularDeque {
    public static final int INIT_CAPACITY = 8;   // initial array capacity
    protected int capacity;  // current capacity of the array
    protected int front;     // index of the front element
    protected int rear;      // index of the rear element
    protected int[] A;       // array deque

    public CircularDeque()      // constructor method
    {
        A = new int[INIT_CAPACITY];
        capacity = INIT_CAPACITY;
        front = rear = 0;
    }

    
    public int print_array_size() {
        return rear - front;
    }


    public boolean isEmpty() {
        return front == rear;
    }


    public int print_front_index() {
        if (isEmpty()) {
            return -1;

        }
        return A[front % capacity];
    }


    public int print_rear_index() {
        if (isEmpty()) {
            return -1;
        }
        return A[(front + rear - 1) % capacity];   // replace this line with your code
    }


    public void enqueue_front(int e) {
        rear++;
        if (print_array_size() == capacity - 1) {
            capacity *= 2;
        }
        int[] B = new int[capacity];
        for (int i = 0; i < print_array_size(); i++) {
            B[i] = A[i];
        }
        A = B;
        for (int i = print_array_size(); i >= front; i--) {
            A[i + 1] = A[i];
        }
        A[front] = e;
        front = front % capacity;
    }

    public void enqueue_back(int e) {
        if (print_array_size() == capacity) {
            capacity *= 2;
            A[rear++] = e;
        } else {
            A[rear++] = e;
        }
        rear++;
    }

    public int dequeue_front() {
        if (capacity >= 8) {
            if (print_array_size() < capacity / 4) {
                capacity /= 2;
            }
        }
        int[] B = new int[capacity];
        for (int i = 1; i < print_array_size(); i++) {
            B[i - 1] = A[i];
        }
        A = B;
        return A[front];
    }


    public int dequeue_back() {
        if (capacity <= 8) {

        } else {

            if (print_array_size() < capacity / 4) {
                capacity /= 2;
            }
        }
        int[] B = new int[capacity];
        for (int i = front; i < print_array_size() - 1; i++) {
            B[i] = A[i];
        }
        A = B;
        rear--;
        return A[rear];
    }
}
