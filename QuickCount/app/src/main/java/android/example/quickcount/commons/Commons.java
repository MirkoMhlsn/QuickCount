package android.example.quickcount.commons;

import java.util.Random;

public class Commons {

    public static int randomInteger(int lowerBound, int upperBound){
        return new Random().ints(1L, lowerBound, upperBound).boxed().findFirst().get();
    }

}
