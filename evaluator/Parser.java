package grind.evaluator;
import java.util.*;

public class Parser{
    private List<Token> tokens;

    public Parser(List<Token> tokens){
        this.tokens = tokens;
    }

    public List<Token> getTokens(){
        return tokens;
    }

    public boolean checkPattern(){
        for(int i = 0; i < tokens.size(); i++){
            if(i % 2 == 0) {
                Token number = tokens.get(i);
                if (number.getType() != TokenType.NUMBER  ){
                    return false;
                }
            }else {
                Token operator = tokens.get(i);
                if (!(operator.getType() == TokenType.PLUS || operator.getType() == TokenType.MINUS  || operator.getType() == TokenType.MULTIPLY || operator.getType() == TokenType.DIVIDE || operator.getType() == TokenType.LEFTPAREN || operator.getType() == TokenType.RIGHTPAREN)){
                    return false;
                }
            }
        }
        return true;
    }

    public double solver () {
       try {
           if (checkPattern()){
               precMultiplyAndDivide();
               precAddAndSub();
           }else{
               throw new NumberException("Not a number");
           }
       }catch (NumberException e){
           System.out.println(e.getMessage());
       }
       return tokens.get(0).getValue();
    }

    public void precMultiplyAndDivide() {
        for (int i = 0; i < tokens.size(); i++) {
            Token operator = tokens.get(i);
            if(i % 2 != 0){
                if (operator.getType() == TokenType.MULTIPLY){
                    double result = Calculator.multiplication(tokenNum(tokens.get(i - 1)), tokenNum(tokens.get(i + 1)));
                    tokens.set(i -1, new Token(TokenType.NUMBER, result));
                    tokens.remove(i);
                    tokens.remove(i);
                    i -= 2;
                }else if(operator.getType() == TokenType.DIVIDE){
                    double result = Calculator.division(tokenNum(tokens.get(i - 1)), tokenNum(tokens.get(i + 1)));
                    tokens.set(i -1, new Token(TokenType.NUMBER, result));
                    tokens.remove(i);
                    tokens.remove(i);
                    i -= 2;
                }
            }
        }
    }

    public void findParen(List<Token> tokens){
        for(int i = 0; i < tokens.size(); i++){
            if(tokens.get(i).getType() == TokenType.LEFTPAREN){

            }
        }
    }

    public void precAddAndSub() {
        for (int i = 0; i < tokens.size(); i++) {
            Token operator = tokens.get(i);
            if(i % 2 != 0){
                if (operator.getType() == TokenType.MINUS){
                    double result = Calculator.subtraction(tokenNum(tokens.get(i - 1)), tokenNum(tokens.get(i + 1)));
                    tokens.set(i -1, new Token(TokenType.NUMBER, result));
                    tokens.remove(i);
                    tokens.remove(i);
                    i -= 2;
                }else if(operator.getType() == TokenType.PLUS){
                    double result = Calculator.addition(tokenNum(tokens.get(i - 1)), tokenNum(tokens.get(i + 1)));
                    tokens.set(i -1, new Token(TokenType.NUMBER, result));
                    tokens.remove(i);
                    tokens.remove(i);
                    i -= 2;
                }
            }
        }
    }



    public double tokenNum(Token token){
        return token.getValue();
        }


        public class NumberException extends Exception{
            public NumberException(String message){
                super (message);
            }
        }
    }
