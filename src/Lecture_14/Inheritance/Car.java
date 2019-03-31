package Lecture_14.Inheritance;

public class Car extends Vehicle {
    public int door = 4;
    public int wheels = 4;
public void run(){
    System.out.println("my car runs");
}

    @Override
    public void pollution() {
        System.out.println("This is how you check pollution");
    }
}
