package com.company;

/**
 * Created by hp197 on 5/14/2017.
 */
public class FloatDouble_Challenge {
    public static void main(String[] args){
        //1. Create variable to store the number of pounds
        double pounds = 200d;

        //2. Calculate the number of Kilograms for the number above and store in a variable
        double convertlbToKgRatio = 1d / 2.2d;
        double kg = pounds * convertlbToKgRatio;
        //3. Print out results
        System.out.printf("%.2f Pounds in kilograms is : %.2fkg", pounds, kg);
    }
}
