package android.example.quickcount;

import androidx.appcompat.app.AppCompatActivity;

import android.example.quickcount.commons.Fraction;
import android.example.quickcount.commons.Numbers;
import android.example.quickcount.exercises.ExerciseSelector;
import android.example.quickcount.exercises.circle.concreteCircleExercises.circleFraction.CircleFractionActivity;
import android.example.quickcount.exercises.circle.concreteCircleExercises.circleFraction.CircleFractionAnswer;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {

    /*TODO The upper and lower bound defined here are only for development. Shouldn't be in prod!*/
    @Deprecated
    public static final int LOWER_BOUND = 0;

    @Deprecated
    public static final int UPPER_BOUND = 12;

    @Deprecated
    public static final Fraction X = Numbers.newRandomFraction(LOWER_BOUND, UPPER_BOUND);

    ProgressBar pb = new ProgressBar(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public static void main(String[] args) {

        /*TODO maybe it is more readable if the whole list of exercises is passed as a List<E> and not with varargs*/
        Stream s = Stream.generate(() -> ExerciseSelector.randomExercise(
                        X,
                        CircleFractionAnswer::new,
                        CircleFractionActivity::new
                ));

    }

}
