package com.kodilla.stream.lambda;

public class ExpressionExecutor {

    public void executeExpresion(double a, double b, MathExpresion mathExpresion) {
        double result = mathExpresion.calculateExpresion(a,b);
        System.out.println("Result equals: " + result);
    }
}
