package com.company;

public class Main {

    public static void main(String[] args) {
        //expressions : values, variables, operators, method calls
        //convert miles to km : 1mile = 1.609344 km
        double kilometers = (100 * 1.609344);

        int highScore = 50;
        if(highScore == 50){
            System.out.println("This is an expression");
        }

        //which are expressions
        int score = 100;//score = 100 is an expression
        if(score > 99){//score > 99 is an expression
            System.out.println("You got the high score!");//"You got the high score!" is an expression
            score = 0;//score = 0 is an expression
        }


    }
}
