//Implement singly linked list, using Node class

public class LinkedList {
    //use necessary variables and methods
    Node head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

//    public void insertEnd(int data) {
//        Node node = new Node();
//        node.data = data;
//        if (head == null) {
//            head = node;
//        } else {
//            Node holder;
//            holder = head;
//            while (holder.next != null) {
//                holder = holder.next;
//            }
//            holder.next = node;
//            node.next = null;
//        }
//    }

    //    Pair implementation
    public void insertEnd(Pair data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;
        } else {
            Node holder;
            holder = head;
            while (holder.next != null) {
                holder = holder.next;
            }
            holder.next = node;
            node.next = null;
        }
    }

//    public void insertBeginning(int data) {
//        Node tracker = new Node();
//        Node node = new Node();
//        node.data = data;
//        if (head != null) {
//            Node holder = new Node();
//            tracker = head;
//            holder = tracker.next;
//            tracker.next = node;
//            node.next = holder;
//        } else {
//            head = node;
//            node.next = null;
//
//        }
//    }

    //    Pair implementation
    public void insertBeginning(Pair data) {
        Node tracker = new Node();
        Node node = new Node();
        node.data = data;
        if (head != null) {
            Node holder = new Node();
            tracker = head;
            holder = tracker.next;
            tracker.next = node;
            node.next = holder;
        } else {
            head = node;
            node.next = null;

        }
    }


//    public void show() {
//        Node node = head;
//        int counter = 0;
//        while (node != null) {
//            System.out.println(node.data);
//            node = node.next;
//            counter++;
//        }
//    }

    //    Pair implementation
    public void show() {
//        PrintWriter pw = null;
//        try {
//            pw = new PrintWriter("outputfiles/tester.txt");
//            Node node = head;
//            while (node != null) {
//                pw.println(((node.data).x) + " " + ((node.data).y));
//                node = node.next;
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        pw.close();

        Node node = head;
        while (node != null) {
            System.out.println(((node.data).x) + " " + ((node.data).y));
            node = node.next;
        }


    }

//    public int showSpecific(int index) {
//        Node node = head;
//        int i = 0;
//        if (node != null) {
//            if (index == 0) {
//                return head.data;
//            }
//            while (node.next != null) {
//                if ((i + 1) == index) {
//                    System.out.println(node.next.data);
//                    return node.next.data;
//                }
//                i++;
//                node = node.next;
//            }
//
//        } else {
//            return -1;
//        }
//        return -1;
//    }

//    Pair implementation

    public Pair showSpecific(int index) {
        Pair p = null;
        Node node = head;
        int i = 0;
        if (node != null) {
            if (index == 0) {
                return head.data;
            }
            while (node.next != null) {
                if ((i + 1) == index) {
                    System.out.println(node.next.data);
                    return node.next.data;
                }
                i++;
                node = node.next;
            }

        } else {
            return p;
        }
        return p;
    }


    public void delete(int position) {
        Node node = head;
        if (node != null) {
            if (position == 0) {
                head = node.next;

            } else {
                for (int i = 0; node != null && i < position - 1; i++) {
                    node = node.next;
                }
//                has found the node
                if (node == null || node.next == null) {
                    return;
                } else {
                    Node next = node.next.next;
                    node.next = next;
                }
            }


        } else {
//            head is null so nothing in there
            System.out.println("List Empty");
        }
    }

    public int getCount() {
        Node node = new Node();
        node = head;
        int counter = 0;
        if (node != null) {
            while (node.next != null) {
                node = node.next;
                counter++;
            }
            return (counter + 1); //true count
        } else {
//            head is null
            return 0;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Pair pair = new Pair(5, 6);
        list.insertBeginning(pair);
        pair = new Pair(6, 7);
        list.insertBeginning(pair);
        list.insertBeginning(pair);
        list.insertBeginning(pair);
        list.show();
    }


}
