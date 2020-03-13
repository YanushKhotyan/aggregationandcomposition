package by.htp.tasks.task_2.impl;

public interface CarConstructorImpl {
    boolean turnOnEngine(int fuelLevel);

    void drive(int fuelLevel, int engineCapacity, int km);

    boolean fuelReserve(int fuelLevel);

    boolean fillUpFuel(int fuelLevel);

    int carConsumption(int engineCapacity);
}
