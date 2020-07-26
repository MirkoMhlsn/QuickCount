package android.example.quickcount.exercises.circle.concreteCircleExercises;

import android.example.quickcount.commons.Fraction;
import android.example.quickcount.exercises.circle.CircleExercise;
import android.example.quickcount.interaction.AnswerInteraction;

public class CircleShare extends CircleExercise implements AnswerInteraction {

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String question() {
        return null;
    }

    @Override
    public int getNumerator() {
        return 0;
    }

    @Override
    public int getDenominator() {
        return 0;
    }

    @Override
    public Fraction correctAnswer() {
        return null;
    }

    @Override
    public Fraction[] wrongAnswers() {
        return new Fraction[0];
    }
}
