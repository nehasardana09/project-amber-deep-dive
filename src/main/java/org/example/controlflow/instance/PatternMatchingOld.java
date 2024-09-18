package org.example.controlflow.instance;

public class PatternMatchingOld {

    public static void main(String[] args) {
        Object obj = "Hello, world!";

        // Traditional instanceof check and cast
        if (obj instanceof String) {
            String str = (String) obj; // Manual casting required
            System.out.println("String length: " + str.length());
        } else {
            System.out.println("Not a string");
        }
    }
}
