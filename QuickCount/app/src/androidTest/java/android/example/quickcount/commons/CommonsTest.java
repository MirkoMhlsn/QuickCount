package android.example.quickcount.commons;

import org.junit.Test;

import java.util.stream.Stream;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.*;

public class CommonsTest {

    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 100;

    private static final int AMOUNT_OF_EXERCISES = 100;
    private static final int NUMBER_OF_EXERCISES = 2;
    private static final double DELTA = 0.2;


    @Test
    public void randomIntegerTest(){
        for(int i = 0; i < AMOUNT_OF_EXERCISES; i++){
            int randomInt = Commons.randomInteger(LOWER_BOUND, UPPER_BOUND);
            assertThat(randomInt, lessThanOrEqualTo(UPPER_BOUND));
            assertThat(randomInt, greaterThanOrEqualTo(LOWER_BOUND));
        }
    }

    @Test
    public void randomIntegerDistributionTest(){

        long distribution = Stream.generate(()->Commons.randomInteger(LOWER_BOUND, UPPER_BOUND))
                .limit(AMOUNT_OF_EXERCISES)
                .filter((i) -> i >= AMOUNT_OF_EXERCISES/NUMBER_OF_EXERCISES)
                .count();

        assertEquals(1.0/(double)NUMBER_OF_EXERCISES, (double)distribution/AMOUNT_OF_EXERCISES, DELTA);
    }

}