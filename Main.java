import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This is your Main program. This File will be run to test all cases, based on the input different function will be called.
 * <p>
 * Complete the given and add necessary functions as  per your requirement.
 */

public class Main {
    public static void StackChecking(Scanner in, PrintWriter out) {
        //use in and out for file input output
        //use your implemented stack for solving problem 1
        //push ordered pairs by writing to file

        Scanner newScanner = in;
        String[] t = new String[200];
        String line = null;

        int y = 0;
        int i = 0;

        while (newScanner.hasNext()) {
            t[i++] = newScanner.next();
        }

        Stack pairStack = new Stack();
        Stack popped = new Stack();
        Pair p = new Pair(12, 18);
        Pair pair = new Pair(2, 4);
        int j;
        for (j = 2; t[j] != null; ) {
//            System.out.println(t[j]);
            if (t[j].equals("i")) {
                p = new Pair((Integer.parseInt(t[j + 1])), Integer.parseInt(t[j + 2]));
                pairStack.push(p);
                j += 2;
            }
            if (t[j].equals("p")) {
                pair = pairStack.getPopElement();
                out.println(pair.returnPair(pair));
                if (pairStack.getSize() == 1) {
                    out.println("Empty \n");
                }
                popped.push(pair);
                pairStack.pop();
                j++;
            }
            j++;

        }
        popped.showElements();

////        Pair implementation
//        Stack pairStack = new Stack();
//        int j = 0;
////        deletes spaces from the string
////        while (t[j] != null) {
////            t[j] = t[j].replace(" ", "");
////            j++;
////        }
////        store the x's in xStack
////        store the y's in yStack
//        int k = 2;
//        int xAccountable = 0;
//        int x = 0;
//        Pair poppers = new Pair(x, y);
//        Stack poppersStack = new Stack();
////        x is equivalent to k
//        Pair pair = new Pair(k, y);
//
//        while (t[k] != null) {
//            if (t[k].equals("p")) {
////                poppers = new Pair(k, y);
////                poppersStack.push(poppers);
//                pairStack.pop();
//                k++;
//            } else {
//
//                while (xAccountable < t[k].length()) {
//                    if (!(t[k].equals("i"))) {
//                        pair = new Pair(Integer.parseInt(t[k]), y);
////                    System.out.println(pair.returnPair(pair));
//                        pairStack.push(pair);
//                        y++;
//                        xAccountable++;
//                    }
//                    else{
//                        continue;
//                    }
//                }
//                xAccountable = 0;
//                y = 0;
//                k++;
//            }
//        }
//        pairStack.showElements();


//        poppersStack.showElements();
//        System.out.println("seperator: ");
//        pairStack.showElements();


//        while (t[k] != null) {
//            if (t[k].equals("p")) {
//                poppers = new Pair(k,y);
//                poppersStack.push(poppers);
//                pairStack.pop();
//                k++;
//            } else {
//
//                while (xAccountable < t[k].length()) {
//                    pair = new Pair(k, y);
////                    System.out.println(pair.returnPair(pair));
//                    pairStack.push(pair);
//                    y++;
//                    xAccountable++;
//                }
//                xAccountable = 0;
//                y = 0;
//                k++;
//            }
//        }


    }


    public static void WordSearch(Scanner in, PrintWriter out) {
        //use in and out for file input output
        //use your implemented stack for solving problem 2


//        StackChecking(in, out);
//        String[] t = new String[200];
//        String line = null;
//        int i = 0;
//        while (newScanner.hasNextLine()) {
//            line = newScanner.nextLine();
//            t[i++] = line;
//        }
//        String lastLine = line; //Stack is the last word
//        System.out.println(lastLine);


//        prints out the first line of the file to determine problem name
        String problemNum = in.nextLine();

//        prints out second and third line to determine matrix size
        String delin = in.nextLine();
        String[] split = delin.split(" ");
        String xOneString = split[0];
        String xTwoString = split[1];

//        Matrix size in integer form
        Integer xOne = Integer.parseInt(xOneString);
        Integer xTwo = Integer.parseInt(xTwoString);

//        stack to hold coords of each item
        Stack stack = new Stack();
        Pair p = new Pair(12, 3);

//        read file's chars into 2d array
        String[][] charHolder = new String[xOne][xTwo];
        int i = 0, j = 0;
        while (i < xOne) {
            if (j == 5) {
                j = 0;
                if ((i + 1) != 5) {
                    i++;
                } else {
                    break;
                }
            }
            p = new Pair(i, j);
            stack.push(p); //coords of each element
            charHolder[i][j] = in.next();
//            System.out.print(charHolder[i][j]);
            j++;
        }
//        System.out.print(charHolder[0][0]);


        String lastLine = in.next(); //word to search for
        String[] lastChars = lastLine.split("");
        int m = 0;
        int a = 0;
        int b = 0;
        int flag = 0;
        Pair pair = new Pair(12, 43);
        Stack toCheck = new Stack();
        LinkedList list = new LinkedList();
        while (m < lastChars.length) {
            while (b < xTwo) {
                while (a < xOne) {
                    if (((charHolder[a][b]).equals(lastChars[m]))) {
//                        first reference point was found (in this case "S")
                        pair = new Pair(a, b);
                        if (flag < 1) {
                            list.insertBeginning(pair);
                            flag++;

                        } else {
                            list.insertEnd(pair);
                            flag++;
                        }
//                        System.out.println(charHolder[a][b] + " a : " + a + " b : " + b);
//                        toCheck.push(pair);
//                        System.out.println("A : " + a + " B: " + b + " " + charHolder[a][b]);
//                        out.println(pair.returnPair(pair));
                    }
                    a++;
                }
                a = 0;
                b++;
            }

            b = 0;
            a = 0;
            m++;
        }
        Node node = new Node();
        Node prev = new Node();
        Node next = new Node();
        node = list.head;
        int counter = 0;
        Pair answerPair = new Pair(12, 23);
        LinkedList answer = new LinkedList();
        while (counter < list.getCount() - 1) {
            if (counter == 0) {
                prev = node;
                node = node.next;
            }

//            System.out.println("Prev: ");
//            System.out.println(prev.data.x + " " + prev.data.y);
//            System.out.println("Next: ");
//            System.out.println(node.data.x + " " + node.data.y);
            if ((Math.abs((prev.data.x - node.data.x)) == 1 && Math.abs((prev.data.y - node.data.y)) <= 1) || (Math.abs(prev.data.y - node.data.y) == 1 && Math.abs(prev.data.x - node.data.x) <= 1)) {
//              good to go
//                do nothing
                prev = prev.next;
                node = node.next;
            } else {
//                so close
                list.delete(counter + 1);
                prev = prev.next;
                node = node.next;
            }

            counter++;
        }
        list.show();
        answer.show();
    }


    public static void CircularQueue(Scanner in, PrintWriter out) {
        //use in and out for file input output
        //use your implemented stack for solving problem 3

        Scanner newScanner = in;
        String[] t = new String[200];
        String line = null;
        CircularDeque circularDeque = new CircularDeque();
        int y = 0;
        int i = 0;

        while (newScanner.hasNext()) {
            t[i++] = newScanner.next();
        }
        for (int j = 0; t[j] != null; j++) {
            System.out.println(t[j]);

        }

        Stack pairStack = new Stack();
        Stack popped = new Stack();
        Pair p = new Pair(12, 18);
        Pair pair = new Pair(2, 4);
        int j;
        for (j = 0; t[j] != null; ) {
//            System.out.println(t[j]);
            if (t[j].equals("e")) {
                if (t[j + 1] == "b") {
                    circularDeque.enqueue_back(Integer.parseInt(t[j + 2]));
                }
                if (t[j + 1] == "f") {
                    circularDeque.enqueue_front(Integer.parseInt(t[j + 2]));
                }
                j += 2;
            }
            if (t[j].equals("d")) {
                if (t[j + 1] == "f") {
                    out.println(circularDeque.dequeue_back());
                    System.out.println(circularDeque.dequeue_back());
                }
                if (t[j + 1] == "f") {
                    out.println(circularDeque.dequeue_front());
                }
                j += 2;
            }
            j++;

        }

    }

    public static void main(String[] args) {
        args = new String[2];
//        args[0] = "inputfiles/test1.txt";
//        args[1] = "outputfiles/tester.txt";

        Main main = new Main();
        if (args.length != 2) {
            System.out.println("ERROR: Not enough Parameters");
            System.exit(0);
        }
        Scanner in = null;
        PrintWriter out = null;
        try {
            args[0] = "inputfiles/test3.txt";
            args[1] = "outputfiles/tester.txt";
            in = new Scanner(new File(args[0]));
            out = new PrintWriter(new File(args[1]));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

//        int ProblemNo = in.nextInt();
        int ProblemNo = 3;
        if (ProblemNo == 1) {
            //Problem 1: Checking of your implemented stack
            StackChecking(in, out);
        } else if (ProblemNo == 2) {
            //Problem 2: Word searching probme
            WordSearch(in, out);
        } else if (ProblemNo == 3) {
            //Problem 3: Circular Dequeue Implementation checking
            CircularQueue(in, out);
        } else {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        in.close();
        out.close();
    }
}
