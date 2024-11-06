package grind.evaluator;

public class Calculator {
    public void canHandle(TokenType type){
        if(type == TokenType.NUMBER){
            System.out.println("Can handle Numbers");
        }else if(type == TokenType.MINUS || type == TokenType.PLUS) {
            System.out.println("I need Numbers not just operators");
        }
    }

    public static double addition(double num1, double num2){
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double num1, double num2){
        return num1 / num2;
    }



}