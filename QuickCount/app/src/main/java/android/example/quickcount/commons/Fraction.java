package android.example.quickcount.commons;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public Fraction reduce(){
        return new Fraction(numerator/gcd(), denominator/gcd());
    }

    public int gcd(){
        return gcd(numerator, denominator);
    }

    private int gcd(int a, int b){
        if(a == 0)
            return b;
        else
            return gcd(Math.max(a, b)%Math.min(a, b), Math.min(a, b));
    }

}
