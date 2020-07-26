package android.example.quickcount.commons;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class FractionTest {

    @Test
    public void gcdTest(){

        Fraction x = new Fraction(8, 12);
        assertThat(x.gcd(), equalTo(4));

    }

    @Test
    public void multiplyTest(){

        Fraction x = new Fraction(1, 3)
                .multiplyWith(new Fraction(3, 4))
                .reduce();

        assertTrue(x.isEqualTo(new Fraction(1,4)));
        assertTrue(x.isGreaterThan(new Fraction(1, 5)));

        x = new Fraction(12, 34)
                .multiplyWith(new Fraction(11,6))
                .reduce();

        assertTrue(x.isEqualTo(new Fraction(11, 17)));
        assertFalse(x.isGreaterThan(new Fraction(3, 4)));

        x = new Fraction(4, 16)
                .multiplyWith(new Fraction(3, 1))
                .reduce();

        assertFalse(x.isEqualTo(new Fraction(3, 8)));
        assertFalse(x.isGreaterThan(new Fraction(7, 8)));

    }

}