package android.example.quickcount.commons;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.*;

public class CommonsTest {

    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 100;

    @Test
    public void randomIntegerTest(){
        for(int i = 0; i < 100; i++){
            int randomInt = Commons.randomInteger(LOWER_BOUND, UPPER_BOUND);
            assertThat(randomInt, lessThanOrEqualTo(UPPER_BOUND));
            assertThat(randomInt, greaterThanOrEqualTo(LOWER_BOUND));
        }
    }

}