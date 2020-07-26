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

    public Fraction multiplyWith(Fraction y){
        return new Fraction(this.numerator*y.getNumerator(), this.denominator*y.getDenominator());
    }

    public boolean isGreaterThan(Fraction y){
        return this.numerator*y.getDenominator() > y.getNumerator()*this.denominator;
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
            return gcd(Math.max(a, b) % Math.min(a, b), Math.min(a, b));
    }

    public boolean isEqualTo(Fraction y){
        y = y.reduce();
        return this.numerator == y.getNumerator() && this.denominator == y.getDenominator();
    }
}
