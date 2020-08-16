package android.example.quickcount.exercises.circle.concreteCircleExercises;


import android.example.quickcount.commons.Fraction;
import android.example.quickcount.exercises.circle.CircleExercise;
import android.example.quickcount.interaction.ActivityInteraction;

public class CircleFractionActivity extends CircleExercise implements ActivityInteraction {

    private Fraction x;

    public CircleFractionActivity(Fraction x){
        this.x = x;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String question() {
        //TODO load the questions from a .json file
        return "load the questions from a .json file";
    }

    @Override
    public int getNumerator() {
        return 0;
    }

    @Override
    public int getDenominator() {
        return 0;
    }
}
