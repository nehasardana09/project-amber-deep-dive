package org.example.controlflow.primitive;

public class PrimitiveExample {


    public static void main(String[] args) {
        Object obj = 42; // You can change this to try different primitive types or objects
        switch (obj) {
            case int i when i == 42 -> System.out.println("I found the meaning of life");
            case Integer i -> System.out.println("Integer: " + i + ", squared: " + (i * i));
            case Double d -> System.out.println("Double: " + d + ", halved: " + (d / 2));
            case String s -> System.out.println("String: " + s + ", length: " + s.length());
            default -> System.out.println("Unknown type");
        }
    }

}
