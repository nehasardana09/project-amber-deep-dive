package org.example.foundational;

import org.jetbrains.annotations.NotNull;

import java.util.function.BiFunction;

public class VarLambdaExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (@NotNull Integer a, @NotNull Integer b) -> a + b;

        //alternative
        BiFunction<Integer, Integer, Integer> sum2 = (@NotNull var a, @NotNull var b) -> a + b;

        BiFunction<Integer,Integer,Integer> sum3 = (var a, var b) -> a + b;
        //same as
        BiFunction<Integer,Integer,Integer> sum4 = (a, b) -> a + b;

        System.out.println(sum.apply(5,43)); //ans: 48


    }
}
