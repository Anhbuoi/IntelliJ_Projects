package com.company;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; //
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result -1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " +result);

        previousResult = result;
        result /= 5;

        System.out.println(previousResult + " / 5 = " + result);

        previousResult= result;
        result %= 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result++;
        System.out.println("Result is now "+ result);

        result--;
        System.out.println("Result is now " + result);

        boolean isAlien = true;
        if(isAlien == false){
            System.out.println("It is not an alien");
        }
        else{
            System.out.println("It is an ALIEN!!!!");
        }

        boolean isCar = false;
        if(isCar  == true)
            System.out.println("This is not suppose to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar was true!");

        //1. Create a double variable with the value 20
        double cash = 20d;

        //2. Create a second variable of type double with the value 80
        double moreCash = 80d;

        //3. Add both numbers up and multiply by 25
        double totalCash = (cash + moreCash) * 25;
        //4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        double remainder = totalCash % 40;
        //5. Write an "if" statement that displays a message "Total was over the limit"
        //  if the remaining total (#4) is equal to 20 or less.
        if(remainder <= 20)
            System.out.println("Total was over the LIMIT!");
    }
}
