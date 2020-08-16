package android.example.quickcount.exercises.circle.concreteCircleExercises;

import android.example.quickcount.commons.Fraction;
import android.example.quickcount.exercises.circle.CircleExercise;
import android.example.quickcount.interaction.AnswerInteraction;

public class CircleFractionAnswer extends CircleExercise implements AnswerInteraction {

    Fraction f;

    public CircleFractionAnswer(Fraction f){
        this.f = f;
    }

    @Override
    public String question() {
        //TODO get the question from a .json file
        return "get the question from a .json file";
    }

    @Override
    public Fraction correctAnswer() {
        return f;
    }

    @Override
    public Fraction[] wrongAnswers() {
        return new Fraction[0];
    }

    @Override
    public int getNumerator() {
        return f.getNumerator();
    }

    @Override
    public int getDenominator() {
        return f.getDenominator();
    }

    @Override
    public int getAge() {
        return 0;
    }
}
