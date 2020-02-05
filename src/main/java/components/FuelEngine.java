

    package components;

    import behaviour.IFuel;

    public class FuelEngine extends Components implements IFuel {
        private String fuelType;
        private int fuelLevel;

        public FuelEngine(String make, String model, String fuelType, int fuelLevel) {
            super(make, model);
            this.fuelType = fuelType;
            this.fuelLevel = fuelLevel;
        }

        public String getFuelType(){
            return this.fuelType;
        }

        @Override
        public void addFuel(String fuel, int amount) {
            this.fuelLevel = this.fuelLevel + amount;
        }
    }

