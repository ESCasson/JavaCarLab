package components;

import behaviour.IFuel;

public class FuelEngine extends Components implements IFuel {
    private String fuelType;
    private int fuelLevel;
    public FuelEngine(String make, String model, String fuelType) {
        super(make, model);
        this.fuelType = fuelType;
        this.fuelLevel = 100;
    }
    public String getFuelType(){
        return this.fuelType;
    }
    public int getFuelLevel() {
        return fuelLevel;
    }
    public String drive(int fuel) {
        this.fuelLevel -= fuel;
        return "Brummm";
    }
    public void fill() {
        this.fuelLevel = 100;
    }

    @Override
    public void addFuel(String fuel, int amount) {
       this.fuelLevel = this.fuelLevel + amount;
    }
}

