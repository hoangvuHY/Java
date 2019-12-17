package Oppa8;

public class Square extends Expression{

    private Expression expression;

    public Square (Expression expression){
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "(" + this.expression+") ^ 2";
    }

    @Override
    public double evaluate() {
        return expression.evaluate()*expression.evaluate();
    }
}
