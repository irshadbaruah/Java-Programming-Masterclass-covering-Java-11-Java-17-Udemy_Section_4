package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is" + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6,10);
        if (centimeters < 0.0){
            System.out.println("Invalid parameters");
        }




        calcFeetAndInchesToCentimeters(100);
        //create a method
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimetes = (feet*12)*2.54;
        centimetes += inches*2.54;
        System.out.println(feet + "feet," + inches + "inches = " + centimetes + "cm");
        return centimetes;
    }
    public static double calcFeetAndInchesToCentimeters( double inches) {
      if (inches < 0){
          return -1;
      }
      double feet = (int) inches / 12;
      double remainingInches =(int) inches % 12;
        System.out.println(inches + "inches is equal to " + feet + " feet and" + remainingInches + "inches" );
         return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }






    public static int calculateScore(String playerName, int score) {
        System.out.println("Player" + playerName + "scored" + score + "points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored" + "scored" + score + "points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name , no player score.");
        return 0;
    }

}

