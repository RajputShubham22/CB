package Lecture_15.Composition;

public class NitroEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Start the car(Nitro)");
    }

    @Override
    public void stop() {
        System.out.println("Stop the car(Nitro)");
    }
}
