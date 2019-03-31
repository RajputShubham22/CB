package Lecture_15.Composition;

public class Car {
    private Engine engine;
    private Brake brake;
    public Car(){
        engine=new PetrolEngine();
        brake=new GenericBrake();
    }

    public Car(PetrolEngine engine, GenericBrake brake) {
        this.engine = engine;
        this.brake = brake;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        brake.apply();
        engine.stop();
    }
}
