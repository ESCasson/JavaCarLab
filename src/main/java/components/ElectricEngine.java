package components;


    public class ElectricEngine extends Components{
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
    }


