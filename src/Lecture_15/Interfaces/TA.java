package Lecture_15.Interfaces;

public interface TA extends Teacher,Student{
    @Override
    void play();

    @Override
    void teach();

    @Override
    void study();
}
