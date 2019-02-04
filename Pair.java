//This class is for maintaining paired item for problem 1 and 2

public class Pair {
    //Declare necessary variables and methods
    int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPair() {
        System.out.println("X: " + x + " Y: " + y);
    }

    public String returnPair(Pair p){
        String answer;
        answer = String.valueOf(p.x) +" "+String.valueOf(p.y);
        return answer;

    }



    public static void main(String[] args) {
        Pair p = new Pair(10,20);
        System.out.println(p.returnPair(p));

        Pair fsd = new Pair(10,20);
        Pair sdf = new Pair(10,20);
        Pair sfsdfsdadf = new Pair(10,20);
        Pair psdfsdf = new Pair(10,20);


    }
}

