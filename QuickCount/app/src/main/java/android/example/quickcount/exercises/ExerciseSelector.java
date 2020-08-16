package android.example.quickcount.exercises;

import android.example.quickcount.commons.Commons;
import android.example.quickcount.commons.Fraction;

import java.util.List;
import java.util.function.Function;

public class ExerciseSelector {

    public static Exercise randomExercise(Fraction x, Function<Fraction, Exercise>... exercises){

        int select = Commons.randomInteger(0, exercises.length - 1);
        return exercises[select].apply(x);

    }

    public static Exercise randomExercise(Fraction x, List<Function<Fraction, Exercise>> exercises){

        int select = Commons.randomInteger(0, exercises.size()-1);
        return exercises.get(select).apply(x);

    }
}
