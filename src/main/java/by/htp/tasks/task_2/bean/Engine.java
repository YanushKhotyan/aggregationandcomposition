package by.htp.tasks.task_2.bean;


public class Engine extends Car
{

    private String engineFuelType;
    private int engineCapacity;
    private int engineConsumption;
    private int fuelLevel;

    public Engine(String engineFuelType, int engineCapacity, int engineConsumption, int fuelLevel) {
        this.engineFuelType = engineFuelType;
        this.engineCapacity = engineCapacity;
        this.engineConsumption = engineConsumption;
        this.fuelLevel = fuelLevel;
    }

    public int isFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getEngineFuelType() {
        return engineFuelType;
    }

    public void setEngineFuelType(String engineFuelType) {
        this.engineFuelType = engineFuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEngineConsumption() {
        return engineConsumption;
    }

    public void setEngineConsumption(int engineConsumption) {
        this.engineConsumption = engineConsumption;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineFuelType='" + engineFuelType + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", engineConsumption=" + engineConsumption +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}
