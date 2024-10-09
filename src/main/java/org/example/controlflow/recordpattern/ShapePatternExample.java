package org.example.controlflow.recordpattern;

// Sealed superclass for different shapes
sealed interface Shape permits Circle, Rectangle {}

// Record representing a Circle
record Circle(double radius) implements Shape {
}
// Record representing a Rectangle
record Rectangle(double length, double width) implements Shape {}

public class ShapePatternExample {

    public static void main(String[] args) {
        Shape shape = new Circle(5.0); // You can switch between Circle or Rectangle

        // Using pattern matching and record patterns to handle different shapes
        if (shape instanceof Circle(var radius)) {
            System.out.println("Circle with radius: " + radius);
        } else if (shape instanceof Rectangle(double length, double width)) {
            System.out.println("Rectangle with dimensions: " + length + "x" + width);
        } else {
            System.out.println("Unknown shape");
        }
    }
}
