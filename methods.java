package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true,800, 5,100);
        System.out.println("Your final score was = " + highScore);
        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(true,800, 5,100);
        System.out.println("Your final score was = " + highScore);

        // Challenge
        //Create a method called displayHighScorePosition
        //it should a player name as a parameter, and a 2nd parameter as a position in the high score table
        //and the position they got and a further message on the high score table.
        //
        //Create a second method called calculateHighScorePosition
        //it should be sent one argument only, the player score
        //it should return an int
        //return data should be
        //1 if the score is >=1000
        //2 if the score is >=500 and < 1000
        //3 if score is  >= 100 and < 500
        //4 in all other cases
        //call both methods and display the result of the following
        //a score of 1500,900,400 and 50

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Pim",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Rouise",highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank",highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position "
                    + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        //       if (playerScore >= 1000){
        //           return 1;
        //       } else if (playerScore >= 500){
        //           return 2;
        //       }else if (playerScore >= 100){
        //           return 3;
        //       }
        //
        //       return 4;

        // OR you cad do like this

        int position = 4; //assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }
        return -1;
    }
}
