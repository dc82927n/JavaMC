package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here

    displayHighScorePosition("play1", 1000);
    calculateHighScorePosition(int score);
        System.out.println(score);

    }

    // Create a method called displayHighScorePosition
    // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".

    public static void displayHighScorePosition(String playerName, int highscoretable ){

//        String playerName = "player1";
//        int highscoretable = 10;

    }

    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an in
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and < 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50
    //

    public static int calculateHighScorePosition () {
        int score;
        score = highscoretable;

        if ( score >= 1000){
            return score;
        }  else if (score >= 500 && < 1000){
            return score;
        } else if (score >= 100 && < 500){
            return score;
        } else {
            return -1;
        }

    }



}


// Create a 2nd method called calculateHighScorePosition
// it should be sent one argument only, the player score
// it should return an in
// the return data should be
// 1 if the score is >=1000
// 2 if the score is >=500 and < 1000
// 3 if the score is >=100 and < 500
// 4 in all other cases
// call both methods and display the results of the following
// a score of 1500, 900, 400 and 50
//