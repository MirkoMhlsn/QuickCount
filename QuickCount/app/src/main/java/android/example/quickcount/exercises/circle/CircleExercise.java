package android.example.quickcount.exercises.circle;

import android.example.quickcount.commons.Fraction;
import android.example.quickcount.exercises.Exercise;

public abstract class CircleExercise extends Exercise {

    private Fraction x;

    public abstract int getNumerator();

    public abstract int getDenominator();

}
