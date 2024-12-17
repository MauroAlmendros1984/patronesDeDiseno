package com.example.patronesDeDiseno.Comportamiento.Interpreter;

public class Addition implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Addition(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}