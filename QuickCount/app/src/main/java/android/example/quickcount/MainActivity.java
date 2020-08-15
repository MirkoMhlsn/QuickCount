package android.example.quickcount;

import androidx.appcompat.app.AppCompatActivity;

import android.example.quickcount.commons.Fraction;
import android.example.quickcount.commons.Numbers;
import android.example.quickcount.exercises.Exercise;
import android.example.quickcount.exercises.ExerciseSelector;
import android.example.quickcount.exercises.circle.concreteCircleExercises.circleFraction.CircleFractionActivity;
import android.example.quickcount.exercises.circle.concreteCircleExercises.circleFraction.CircleFractionAnswer;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {

    /*TODO The upper and lower bound defined here are only for development. Shouldn't be in prod!*/
    @Deprecated
    public static final int LOWER_BOUND = 0;

    @Deprecated
    public static final int UPPER_BOUND = 12;

    @Deprecated
    public static final Fraction X = Numbers.newRandomFraction(LOWER_BOUND, UPPER_BOUND);

    private static List<Function<Fraction, Exercise>> allExercises = Arrays.asList(
            CircleFractionActivity::new,
            CircleFractionAnswer::new
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {

        /*TODO maybe it is more readable if the whole list of exercises is passed as a List<E> and not with varargs*/
        Stream.generate(() -> ExerciseSelector.randomExercise(X, allExercises))
                .forEach(Exercise::question);
    }

    public static Exercise nextExercise(){
        return ExerciseSelector.randomExercise(X, allExercises);
    }

}
