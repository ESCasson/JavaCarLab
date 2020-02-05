import java.util.ArrayList;

    public class Dealership {
        Double till;
        ArrayList<Integer> cars;
        public Dealership(Double till){
            this.till = till;
            this.cars = new ArrayList<>();
        }
        public Double getTill() {
            return till;
        }
        public ArrayList<Integer> getCars() {
            return cars;
        }
        public void buyCar(Integer car){
            this.till -= car;
            this.cars.add(car);
        }
        public void sellCar(Integer car){
            this.till += car;
            this.cars.remove(car);
        }
        public void payForRepairs(Integer car){
            this.till -= car;
            // car.repair(insert damage here)
        }
    }

