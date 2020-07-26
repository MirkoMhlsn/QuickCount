package android.example.quickcount.exercises.numberline.concreteNumberlineExcercises.concreteZNumberlineExcercises;

import android.example.quickcount.commons.Fraction;
import android.example.quickcount.exercises.numberline.concreteNumberlineExcercises.ZNumberlineExercise;
import android.example.quickcount.interaction.AnswerInteraction;

public class ZNumberlineCalculate extends ZNumberlineExercise implements AnswerInteraction {

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String question() {
        return null;
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
