package Lecture_15.Composition;

public class GenericBrake implements Brake {

    @Override
    public void apply() {
        System.out.println("Apply Generic Brake");
    }
}
