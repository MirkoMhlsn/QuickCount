package android.example.quickcount.commons;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class FractionTest {

    private static Fraction fraction;

    @BeforeClass
    public static void setUp(){
        fraction = new Fraction(8, 12);
    }

    @Test
    public void gcdTest(){
        assertThat(fraction.gcd(), equalTo(4));
    }

}