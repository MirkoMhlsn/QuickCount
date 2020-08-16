package android.example.quickcount.exercises;


import android.content.Context;
import android.example.quickcount.commons.Fraction;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public abstract class Exercise {

    @Deprecated
    private int age;

    @Deprecated
    public abstract int getAge();

    public abstract String question();

}
