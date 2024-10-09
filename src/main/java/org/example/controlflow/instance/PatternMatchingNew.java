package org.example.controlflow.instance;

public class PatternMatchingNew {

    public static void main(String[] args) {
        Object obj = "Hello, world!";

        // Using pattern matching with instanceof
        if (obj instanceof String str) { // Automatic casting
            System.out.println("String length: " + str.length());
        } else if (obj instanceof int i) { //how did that happen?? :)
            System.out.println("Integer length: " + i);
        }
        else {
            System.out.println("Not a string");
        }
    }
}
