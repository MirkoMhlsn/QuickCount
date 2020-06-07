package android.example.quickcount.commons;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberGenerator {

    public Fraction generate(int lowerBound, int upperBound){

        Integer[] a = new Random().ints(lowerBound, upperBound).limit(2).boxed().toArray(Integer[]::new);
        return new Fraction(a[0], a[1]);

    }

}
