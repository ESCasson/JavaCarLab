import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {
    private double money;
    private ArrayList<Car> ownedCars;

    public Customer(double money) {
        this.money = money;
        this.ownedCars = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public int countCarsOwned() {
        return ownedCars.size();
    }

    public void addCar(Car car) {
        ownedCars.add(car);
    }

    public void removeMoney(double money) {
        this.money = this.money - money;
    }

    public void buyCar(Car car) {
        addCar(car);
        double price = car.getPrice();
        removeMoney(price);
    }
}
