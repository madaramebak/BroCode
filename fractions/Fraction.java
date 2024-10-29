package fractions;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) throws Exception{
        this.numerator = numerator;
        if(denominator == 0){
            throw new Exception("Denominator cannot be zero");
        }else {
            this.denominator = denominator;
        }
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) throws Exception{
        if(denominator == 0){
            throw new Exception("Denominator cannot be zero");
        }else {
            this.denominator = denominator;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }
}


