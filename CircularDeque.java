//implement circular deque here

    //create necessary variables and methods
    public class CircularDeque
    {
        public static final int INIT_CAPACITY = 8;   // initial array capacity
        protected int capacity;  // current capacity of the array
        protected int front;     // index of the front element
        protected int rear;      // index of the rear element
        protected int[] A;       // array deque

        public CircularDeque( )      // constructor method
        {
            A = new int[ INIT_CAPACITY ];
            capacity = INIT_CAPACITY;
            front = rear = 0;
        }

        /**
         * Returns the number of items in this collection.
         * @return the number of items in this collection.
         */
        public int print_array_size( )
        {
            return rear - front;
        }

        /**
         * Returns true if this collection is empty.
         * @return true if this collection is empty.
         */
        public boolean isEmpty( )
        {
            return front == rear;
        }
        /**
         * Returns the first element of the deque
         */
        public int print_front_index()
        {
            if(isEmpty()){
                return -1;

            }
            return A[front % capacity];
        }
        /**
         * Returns the last element of the deque
         */
        public int print_rear_index( )
        {
            if(isEmpty()){
                return -1;
            }
            return A[(front + rear - 1) % capacity];   // replace this line with your code
        }
        /**
         * Inserts e at the beginning (as the first element) of the deque
         */
        public void enqueue_front( int e )
        {
            rear++;
            if(print_array_size() == capacity-1){
                capacity *= 2;
            }
            int[] B = new int[capacity];
            for(int i = 0; i < print_array_size(); i++){
                B[i] = A[i];
            }
            A = B;
            for(int i = print_array_size(); i >= front; i--){
                A[i+1] = A[i];
            }
            A[front] = e;
            front = front % capacity;
        }
        /**
         * Inserts e at the end (as the last element) of the deque
         */
        public void enqueue_back( int e )
        {
            if(print_array_size() == capacity){
                capacity *= 2;
                A[rear++] = e;
            }
            else{
                A[rear++] = e;
            }
            rear++;
        }
        /**
         * Removes and returns the first element of the deque
         * Shrink array by half of current size N when number of elements in the deque falls below N/4
         * minimum capacity should always be 8
         */
        public int dequeue_front( )
        {
            if(print_array_size() == 0){
               return -1;
            }
            if(capacity >= 8){
                if(print_array_size() < capacity/4){
                    capacity /= 2;
                }
            }
            int[] B = new int[capacity];
            for(int i = 1; i < print_array_size(); i++){
                B[i-1] = A[i];
            }
            A = B;
            return A[front];
        }
        /**
         * Removes and returns the last element of the deque
         * Shrink array by half of current size N when number of elements in the deque falls below N/4
         * minimum capacity should always be 8
         */
        public int dequeue_back( )
        {
            if(print_array_size() == 0){
                return -1;
            }
            if(capacity >= 8){
                if(print_array_size() < capacity/4){
                    capacity /= 2;
                }
            }
            int[] B = new int[capacity];
            for(int i = front; i<print_array_size()-1; i++){
                B[i] = A[i];
            }
            A = B;
            rear--;
            return A[rear];
        }
    }
