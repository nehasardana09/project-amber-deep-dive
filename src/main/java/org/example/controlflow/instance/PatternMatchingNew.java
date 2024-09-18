package org.example.controlflow.instance;

public class PatternMatchingNew {

    public static void main(String[] args) {
        Object obj = "Hello, world!";

        // Using pattern matching with instanceof
        if (obj instanceof String str) { // Automatic casting
            System.out.println("String length: " + str.length());
        } else {
            System.out.println("Not a string");
        }
    }
}
