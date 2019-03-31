package Lecture_15.Composition;

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Start the car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the car");
    }
}
