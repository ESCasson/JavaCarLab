

    package components;
    public class FuelEngine extends Components{
        private String fuelType;

        public FuelEngine(String make, String model, String fuelType) {
            super(make, model);
            this.fuelType = fuelType;
        }

        public String getFuelType(){
            return this.fuelType;
        }
    }

