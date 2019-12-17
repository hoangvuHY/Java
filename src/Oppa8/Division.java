package Oppa8;

public class Division extends BinaryExpression {
    public Division(Expression left,Expression right){
        if(right.evaluate() == 0){
            throw new ArithmeticException("Lỗi chia cho 0");
        }else {
            this.left = left;
            this.right = right;
        }
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " / "+right.toString()+")";
    }

    @Override
    public double evaluate() {
        return left.evaluate()/right.evaluate();
    }
}
