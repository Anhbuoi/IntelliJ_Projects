package com.company;

public class Main {

    public static void main(String[] args) {
        char myChar = '\u00A9';//This is a unicode character, just search unicode character table
        //System.out.println("myChar in unicode: " + myChar);

        boolean question = false;
        boolean isMale = true;

        //1. Find the code for registered symbol on the same line as the copyright symbol.
        myChar = '\u00AE';
        //2. Create a variable of type char and assign it the unicode value for that symbol.
        //3. Display in on screen.
        //System.out.println("myChar in unicode: " + myChar);

        if(myChar == '\u00A9'){
            System.out.println("The character is a copyright symbol: " + myChar);
        }
        if(myChar == '\u00AE'){
            System.out.println("The character is a registered symbol: " + myChar);
        }


    }
}
