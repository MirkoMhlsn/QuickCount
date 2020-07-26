package android.example.quickcount.interaction;

import android.example.quickcount.commons.Fraction;

public interface AnswerInteraction {

    Fraction correctAnswer();

    Fraction[] wrongAnswers();

}
