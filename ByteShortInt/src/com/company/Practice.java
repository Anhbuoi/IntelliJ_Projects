package com.company;

/**
 * Created by hp197 on 5/14/2017.
 */
public class Practice {
    public static void main(String[] args){
        //1. Create a byte variable and set it to any valid byte number.
        byte byteNum1 = 100;//-128-127 byte number range

        //2. Create a short variable and set it to any valid short number.
        short shortNum = -20_000; //-32,768 - 32,767

        //3. Create a int variable and set it to any valid int number.
        int intNum = 2_000_000_000;//-2,147,483,648 - 2,147,483,647

        //4. Create a variable of type long, and make it equal to 50000 + 10 Timers the sum of the byte, plus the short plus the int
        long total;
        total = (50_000L + 10L * (long)( byteNum1 +  shortNum + intNum));

        System.out.println("The total long of all the numbers are: " + total);

    }
}
