package com.company;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes )
        int myIntValue = 5;

        //width 0f float = 32 ( 4 bytes )
        float myFloatValue = 5.4f; //needed to cast to float to work or just put f at the end

        //width 0f float = 64 ( 8 bytes )
        double myDoubleValue = 5d; //d just tells it the datatype is double

        myIntValue = 5/3;
        myFloatValue = 5f/3f;
        myDoubleValue = 5d / 3d;
        System.out.println("myIntValue: " + myIntValue);
        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println("myDoubleValue: "+ myDoubleValue);




    }
}
