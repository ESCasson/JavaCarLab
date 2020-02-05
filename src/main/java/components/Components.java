package components;

    public abstract class Components {

        private final String make;
        private final String model;

        public Components(String make, String model){
            this.make = make;
            this.model = model;
        }

        public String getMake(){
            return this.make;
        }
        public String getModel(){
            return this.model;
        }
    }

