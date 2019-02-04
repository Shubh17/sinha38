//implementation of stack using your implemented Linked List

public class Stack {
    //Declare necessary variables and methods
    public LinkedList linkedList = new LinkedList();

    //    public void push(int data) {
////        LIFO
//        linkedList.insertEnd(data);
//    }


    //    Pair implementation
    public void push(Pair data) {
//        LIFO
        linkedList.insertEnd(data);
    }


    public void pop() {
        if (getSize() > 1) {
            linkedList.delete(getSize() - 1);
        } else {
            System.out.println("Empty \n");
        }

    }

    public Pair getPopElement() {
        Pair p = new Pair(0, 0);
//        pop the top of the stack
        if (getSize() > 0) {
//            System.out.println("size: "+ getSize());
            return linkedList.showSpecific(getSize() - 1);
        } else {
            System.out.println("Empty \n");
            return p;
        }

    }

//    public void pop() {
////        pop the top of the stack
//        if (getSize() > 0) {
////            System.out.println("size: "+ getSize());
//            linkedList.delete(getSize() - 1);
//        } else {
//            System.out.println("Empty \n");
//        }
//
//    }

    public int isEmpty() {
        int count = linkedList.getCount();
        if (count == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getSize() {
        return (linkedList.getCount());
    }


    public void showElements() {
        linkedList.show();
    }

    //    public int specificElement(int index) {
//        int answer = linkedList.showSpecific(index);
//        return answer;
//
//    }

//    public int specificElement(int index) {
//        int answer = linkedList.showSpecific(index);
//        return answer;
//
//    }

    //    Pair implementation
    public Pair specificElement(int index) {
        Pair answer = linkedList.showSpecific(index);
        return answer;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        Pair p = new Pair(2, 4);
        stack.push(p);
        p = new Pair(6, 3);
        stack.push(p);
        p = new Pair(2, 344);
        stack.push(p);
        p = new Pair(2, 213);
        stack.push(p);
        p = new Pair(2, 1232);
        stack.push(p);
        Pair l = stack.getPopElement();
        System.out.println("x: " + l.x);
        System.out.println("y: " + l.y);
        System.out.println("All the elements before popping");
        stack.showElements();
        System.out.println("All the elements after popping first");
        stack.pop();


    }


}