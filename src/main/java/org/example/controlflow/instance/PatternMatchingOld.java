package org.example.controlflow.instance;

import static java.io.IO.println;

public class PatternMatchingOld {

    public static void main(String[] args) {
        Object obj = "Hello, world!";

        // Traditional instanceof check and cast
        if (obj instanceof String) {
            String str = (String) obj; // Manual casting required
            //Noticed anything new?
            println("String length: " + str.length());
        } else {
            System.out.println("Not a string");
        }
    }
}
