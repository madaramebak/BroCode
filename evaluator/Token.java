package grind.evaluator;

public class Token {
    private double value;
    private TokenType type;

    public Token(TokenType type, double value){
        this.type = type;
        this.value = value;
    }

    public Token(TokenType type){
        this.type = type;
    }
    public double getValue() {
        return value;
    }

    public TokenType getType() {
        return type;
    }

}