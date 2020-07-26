package android.example.quickcount.commons;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.*;

public class NumberGeneratorTest {

    private static int[][] tuples = {
            {3, 7},
            {5, 9},
            {2, 70},
            {6, 12},
            {6, 7}
    };

    @Test
    public void generateTest(){

        for(int[] tuple: tuples){
            int x = Commons.randomInteger(tuple[0], tuple[1]);

            assertThat(x, greaterThanOrEqualTo(tuple[0]));
            assertThat(x, lessThanOrEqualTo(tuple[1]));
        }

    }

    @Test
    public void numberGeneratorTest(){

        Fraction a = Numbers.newRandomFraction(3, 7);

        assertThat(a.getNumerator(), greaterThanOrEqualTo(3));
        assertThat(a.getNumerator(), lessThanOrEqualTo(7));

        assertThat(a.getDenominator(), greaterThanOrEqualTo(3));
        assertThat(a.getDenominator(), lessThanOrEqualTo(7));
    }

}