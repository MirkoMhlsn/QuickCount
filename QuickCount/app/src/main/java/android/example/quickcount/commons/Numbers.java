package android.example.quickcount.commons;

public class Numbers {

    public static Fraction newRandomFraction(int lowerBound, int upperBound){

        int x = Commons.randomInteger(lowerBound, upperBound);
        int y = Commons.randomInteger(lowerBound, upperBound);
        return (x < y) ? new Fraction(x, y) : new Fraction(y, x);

    }

}
