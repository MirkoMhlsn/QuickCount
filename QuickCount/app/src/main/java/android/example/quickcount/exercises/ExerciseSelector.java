package android.example.quickcount.exercises;

import android.example.quickcount.commons.Commons;
import android.example.quickcount.commons.Fraction;
import java.util.function.Function;

public class ExerciseSelector {

    public static Exercise randomExercise(Fraction x, Function<Fraction, Exercise>... exercises){

        int select = Commons.randomInteger(0, exercises.length - 1);
        System.out.println(select);
        return exercises[select].apply(x);

    }
}
