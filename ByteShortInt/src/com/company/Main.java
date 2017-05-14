package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        //int has a width of 32
        int myMinValue = -2_147_483_648;//if you add any number after this it will error because out of value allocation for int
        int myMaxValue = 2_147_483_647;//Underscores just make it easier to use ( literals)
        int myTotal = (myMinValue / 2);
        System.out.println("The int myMinValue / 2: " + myMinValue);

        //byte has a width of 8
        byte myByteMinValue = -128;
        byte myByteMaxValue = 127;
        //byte myNewByteValue = (myByteMinValue/2); //You can't do this calculation because it is not a literal of byte because expressions are done in integer datatype
        byte myNewByteValue = (byte) (myByteMinValue/2); //cast the expression to (byte) datatype
        System.out.println("myNewByteValue: " + myNewByteValue);

        //short has a width of 16
        short myShortMinValue = -32768;
        short myShortMaxValue = 32767;

        //long has a width of 64
        long myLongValue = 100L; //Capital L lets computer know it's a Long value
        long myLongMinValue = -9_223_372_036_854_775_808L;
        long myLongMaxValue = 9_223_372_036_854_775_807L;


    }
}
