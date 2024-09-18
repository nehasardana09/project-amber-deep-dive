package org.example.controlflow.unnamed.patterns;

public class UnnamedPatternInstanceofExample {

    public static void main(String[] args) {
        Object obj = "Hello, world!";

        // Using unnamed patterns with instanceof
        if (obj instanceof Integer _) {
            System.out.println("It's an Integer, but we don't need the value");
        } else if (obj instanceof String _) {
            System.out.println("It's a String, but we don't need the value");
        } else {
            System.out.println("Unknown type");
        }
    }
}
