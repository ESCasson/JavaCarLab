import java.util.ArrayList;

    public class Dealership {
        Double till;
        ArrayList<Car> cars;

        public Dealership(Double till){
            this.till = till;
            this.cars = new ArrayList<>();
        }

        public Double getTill() {
            return till;
        }

        public ArrayList<Car> getCars() {
            return cars;
        }

        public void buyCar(Car car){
            this.till -= car.getPrice();
            this.cars.add(car);
        }

        public void sellCar(Car car){
            this.till += car.getPrice();
            this.cars.remove(car);
        }

        public void payForRepairs(Car car){
            this.till -= car.getDamage();
            car.setDamage(0);
        }
    }

