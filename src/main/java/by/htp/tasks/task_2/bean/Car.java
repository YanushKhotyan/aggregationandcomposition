package by.htp.tasks.task_2.bean;

public class Car {

    private String model;
    private Wheel wheel;
    private Engine engine;

    public Car() {
    }

    public Car(String model, Wheel wheel, Engine engine) {
        this.model = model;
        this.wheel = wheel;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", size=" + wheel +
                ", type=" + engine +
                '}';
    }
}
