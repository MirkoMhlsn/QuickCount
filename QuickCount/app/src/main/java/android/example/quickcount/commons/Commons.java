package android.example.quickcount.commons;

import java.util.Random;

public class Commons {

    public static int randomInteger(int lowerBound, int upperBound){

        /*the upper bound gets incremented by one so that the upper bound is within the interval of return values.*/
        return new Random().ints(1L, lowerBound, upperBound + 1).boxed().findAny().get();

    }

}
