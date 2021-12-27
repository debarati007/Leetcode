package Misc.Java8;

public class LambdaExpression {

    public static void main(String[] args) {
        NewInterface lambdaExpression = (int x, int y) -> System.out.println(x + y);
        lambdaExpression.getSum(5,5);
    }

}
