package org.example.controlflow.patternmatching;

public class PatternMatchingWithSwitch {
    public void main() {
        Expression two = new Constant(2);
        Expression four = new Constant(4);
        Expression negativeOne = new Negate(new Constant(1));
        System.out.println(evaluate(negativeOne));
        Expression sumTwoAndFour = new Add(two, four);
        System.out.println(evaluate(sumTwoAndFour));
        Expression multiplyTwoAndFour = new Multiply(two, four);
        System.out.println(evaluate(multiplyTwoAndFour));
        Expression quotient = new Divide(new Constant(25),four);
        System.out.println(evaluate(quotient));
        Expression difference = new Subtract(four,two);
        System.out.println(evaluate(difference));
    }
    private int evaluate(Expression expression) {
        return switch (expression){
            case Constant(int c) -> c;
            case Negate(Expression e) -> -evaluate(e);
            case Exponent(Expression e, int exponent) -> (int)Math.pow(evaluate(e), exponent);
            case Add(Expression l, Expression r) -> evaluate(l) + evaluate(r);
            //case Multiply(Expression l, _) -> evaluate(l) * 2;
            case Multiply(Expression l, var r) -> evaluate(l) * evaluate(r);
            case Divide(Expression l, var r) -> evaluate(l) / evaluate(r);
            case Subtract(Expression l, Expression r) -> evaluate(l)-evaluate(r);
        };
    }
}
sealed interface Expression permits Constant, Negate, Exponent, Add, Subtract, Multiply, Divide {}

record Constant(int value) implements Expression {}
record Negate(Expression expression) implements Expression {}
record Exponent(Expression expression, int exponent) implements Expression {}
record Add(Expression left, Expression right) implements Expression {}
record Multiply(Expression left, Expression right) implements Expression {}
record Divide(Expression numerator, Expression denominator) implements Expression {}
record Subtract(Expression left, Expression right) implements Expression {}
