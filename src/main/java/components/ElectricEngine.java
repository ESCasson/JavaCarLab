package components;


import behaviour.IElectric;

public class ElectricEngine extends Components implements IElectric {
        private String fuelType;
        private int fuelLevel;

        public ElectricEngine(String make, String model, String fuelType, int fuelLevel) {
            super(make, model);
            this.fuelType = fuelType;
            this.fuelLevel = fuelLevel;
        }

        public String getFuelType(){
            return this.fuelType;
        }

    @Override
    public void addCharge(int amount) {
        this.fuelLevel = this.fuelLevel + amount;
    }
}


