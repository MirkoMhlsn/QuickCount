package android.example.quickcount.exercises;


import android.content.Context;
import android.example.quickcount.commons.Fraction;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public abstract class Exercise extends View {

    @Deprecated
    private int age;

    public Exercise(Context context){
        super(context);
    }

    public Exercise(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Exercise(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Exercise(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Deprecated
    public abstract int getAge();

    public abstract String question();

    public Exercise generate(Fraction x){
        return null;
    }

    @Override
    public abstract void onDraw(Canvas canvas);

    public abstract void init(@Nullable AttributeSet attrs);

}
