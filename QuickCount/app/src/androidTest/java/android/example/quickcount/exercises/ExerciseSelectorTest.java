package android.example.quickcount.exercises;

import android.example.quickcount.commons.Fraction;
import android.example.quickcount.exercises.circle.concreteCircleExercises.circleFraction.CircleFractionActivity;
import android.example.quickcount.exercises.circle.concreteCircleExercises.circleFraction.CircleFractionAnswer;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ExerciseSelectorTest {

    private static final Fraction X = new Fraction(9,12);
    private static final int AMOUNT_OF_EXERCISES = 100;
    private static final int NUMBER_OF_EXERCISES = 2;
    private static final double DELTA = 0.2;


    @Test
    public void randomExercisesTest(){

        long distribution = Stream.generate(()->ExerciseSelector.randomExercise(X, CircleFractionActivity::new, CircleFractionAnswer::new))
                .limit(AMOUNT_OF_EXERCISES)
                .filter((e)-> e instanceof CircleFractionAnswer)
                .count();

        assertEquals(1.0/(double)NUMBER_OF_EXERCISES, (double)distribution/(double)AMOUNT_OF_EXERCISES, DELTA);
    }

}