package by.htp.tasks.task_2.bean;

public class Wheel extends Car {

    private int wheelSize;
    private String wheelColor;
    private String wheelMetalType;

    public Wheel(String model, Wheel size, Engine type, int wheelSize, String wheelColor, String wheelMetalType) {
        super(model, size, type);
        this.wheelSize = wheelSize;
        this.wheelColor = wheelColor;
        this.wheelMetalType = wheelMetalType;
    }

    public Wheel(int wheelSize, String wheelColor, String wheelMetalType) {
        this.wheelSize = wheelSize;
        this.wheelColor = wheelColor;
        this.wheelMetalType = wheelMetalType;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getWheelColor() {
        return wheelColor;
    }

    public void setWheelColor(String wheelColor) {
        this.wheelColor = wheelColor;
    }

    public String getWheelMetalType() {
        return wheelMetalType;
    }

    public void setWheelMetalType(String wheelMetalType) {
        this.wheelMetalType = wheelMetalType;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheelSize=" + wheelSize +
                ", wheelColor='" + wheelColor + '\'' +
                ", wheelMetalType='" + wheelMetalType + '\'' +
                '}';
    }
}
