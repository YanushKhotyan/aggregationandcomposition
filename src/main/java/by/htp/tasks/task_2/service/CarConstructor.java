package by.htp.tasks.task_2.service;

import by.htp.tasks.task_2.impl.CarConstructorImpl;

public class CarConstructor implements CarConstructorImpl
{

    public boolean turnOnEngine(int fuelLevel) {
        if (fuelReserve(fuelLevel)) {
            return true;
        }
        System.out.println("Engine is broken. Go to the service");
        return false;
    }

    public void drive(int fuelLevel, int engineCapacity, int km) {
        if (turnOnEngine(fuelLevel)) {
            int capacity = carConsumption(engineCapacity);
            for (int i = km; i < 0; i -= capacity) {
                fuelLevel--;
                if (fillUpFuel(fuelLevel)) {
                    fuelLevel += 20;
                }
            }
        }
    }



    public boolean fuelReserve(int fuelLevel) {
        if (fuelLevel != 0) {
            return true;
        }
        System.out.println("Not enough fuel");
        return false;
    }

    public boolean fillUpFuel(int fuelLevel) {
        if (fuelLevel == 5) {
            return true;
        }
        return false;
    }


    public int carConsumption(int engineCapacity) {
        if (engineCapacity < 1000) {
            return 6;
        } else if (engineCapacity > 1000 && engineCapacity < 2000) {
            return 8;
        } else if (engineCapacity > 2000 && engineCapacity < 3000) {
            return 10;
        } else if (engineCapacity > 3000 && engineCapacity < 4000) {
            return 10;
        } else if (engineCapacity > 4000) {
            return 20;
        }
        System.out.println("Fuel sensor is broken");
        return 0;
    }
}
