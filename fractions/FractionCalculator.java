package fractions;

public class FractionCalculator {


    public Fraction add(Fraction fraction1, Fraction fraction2) throws Exception{
        int newDenominator = fraction1.getDenominator() * fraction2.getDenominator();
        int newNumerator = (fraction1.getNumerator() * fraction2.getDenominator()) + (fraction2.getNumerator() *
                fraction1.getDenominator());

        return new Fraction(newNumerator, newDenominator);

    }
    public Fraction subtraction(Fraction fraction1, Fraction fraction2) throws Exception{
        int newDenominator = fraction1.getDenominator() * fraction2.getDenominator();
        int newNumerator = (fraction1.getNumerator() * fraction2.getDenominator()) - (fraction2.getNumerator() *
                fraction1.getDenominator());

        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiplication(Fraction fraction1, Fraction fraction2) throws Exception{
        int newNumerator = fraction1.getNumerator() * fraction2.getNumerator();
        int newDenominator = fraction1.getDenominator() * fraction2.getDenominator();

        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction division(Fraction fraction1, Fraction fraction2) throws Exception{
        int newNumerator = fraction1.getNumerator() * fraction2.getDenominator();
        int newDenominator = fraction1.getDenominator() * fraction2.getNumerator();


        return new Fraction(newNumerator, newDenominator);
    }


}