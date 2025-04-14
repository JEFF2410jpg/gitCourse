public class Main {
    public static void main(String[] args) {

        int
                myVariable
                =
                50;//Java ignore white spaces
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        System.out.println("This is" + "Another" + "still more.");
        int anotherVariable = 50;//code>reformat code
        myVariable--;
        System.out.println("Mi variable " + myVariable);

//select text tap to add spaces
//select text tap + shift to eliminate spaces
        if (myVariable == 0)
            System.out.println("It`s now zero");

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        if (score < 5000 && score > 100) {
            System.out.println("Your score was less then 5000 but greater than 1000");
        }else if(score < 1000) {
            System.out.println("Your score was less than 1000");
        }else{
            System.out.println("Got here");
        }

    }
}
