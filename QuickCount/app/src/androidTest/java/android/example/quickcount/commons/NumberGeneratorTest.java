package android.example.quickcount.commons;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class NumberGeneratorTest {

    private static NumberGenerator generator;

    @BeforeClass
    public static void setUp(){
        generator = new NumberGenerator();
    }

    @Test
    public void numberGeneratorTest(){
        Fraction a = generator.generate(3, 7);

        assertThat(a.getNumerator(), greaterThan(3));
        assertThat(a.getNumerator(), lessThan(7));

        assertThat(a.getDenominator(), greaterThan(3));
        assertThat(a.getDenominator(), lessThan(7));
    }

}