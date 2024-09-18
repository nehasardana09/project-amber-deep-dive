package org.example.controlflow.primitive;

public class PrimitiveExample {


    public static void main(String[] args) {
        Object obj = 42; // You can change this to try different primitive types or objects
        //int obj = 42; //should work with java 23
        // Using pattern matching in switch with primitives
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i + ", squared: " + (i * i));
            case Double d -> System.out.println("Double: " + d + ", halved: " + (d / 2));
            case String s -> System.out.println("String: " + s + ", length: " + s.length());
            default -> System.out.println("Unknown type");
        }
    }

}
