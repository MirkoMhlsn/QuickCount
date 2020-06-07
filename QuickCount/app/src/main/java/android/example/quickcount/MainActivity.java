package android.example.quickcount;

import androidx.appcompat.app.AppCompatActivity;

import android.example.quickcount.excercises.Exercise;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {

    ProgressBar pb = new ProgressBar(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public static void main(String[] args) {
        //Exercise exercise = new Exercise();
        //Stream s = Stream.generate(exercise::generate);

    }

}
