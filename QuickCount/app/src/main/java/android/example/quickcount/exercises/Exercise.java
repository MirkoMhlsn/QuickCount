package android.example.quickcount.exercises;


public abstract class Exercise {

    int age;

    public abstract int getAge();

    public abstract String question();

    public Exercise generate(int lowerBound, int upperBound){
        return null;
    }

}
