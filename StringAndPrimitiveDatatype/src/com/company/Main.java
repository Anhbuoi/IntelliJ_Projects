package com.company;

public class Main {

    public static void main(String[] args) {
        //Primitive datatypes
            //byte
            //short
            //int
            //long
            //float
            //double
            //char
            //boolean

        //Strings
        String myString = "This is a string";
        System.out.println("this is my string: "+ myString);

        myString += " This is more";
        System.out.println("This is added: "+ myString);

        myString += " \u00A9 Hai 2017";
        System.out.println("This is third added string: " + myString);
    }
}
