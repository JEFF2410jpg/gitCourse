public class MainChallenge {
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
        int finalScore = score;
        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was:" + finalScore);
        }
        score = 10000;
        levelCompleted=8;
        bonus =200;
        finalScore = score;
        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was : "+ finalScore);
        }
        /*calculationScore(true, 800, levelCompleted, bonus);
        calculationScore(true, 800, 5, 100);
         */

        gameOver = true;
        score = 1000;
        levelCompleted = 8;
        bonus = 200;
        int higtScore = calculationScore1(gameOver, score,levelCompleted, bonus);
    }

   /* public static void calculationScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was:" + finalScore);
        }
    }*/
    public static int calculationScore1 (boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was:" + finalScore);
        }
        return finalScore;
    }
}

