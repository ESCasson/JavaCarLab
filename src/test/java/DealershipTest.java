import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    Car car;

    @Before
    public void before(){
        dealership = new Dealership(30000.0);
        car = new Car("Nissan", "Skyline", 3, "Midnight Purple II", 100, 20000);
    }

    @Test
    public void canGetTill(){
        assertEquals(30000.0, dealership.getTill(), 0.00);
    }

    @Test
    public void carsStartEmpty(){
        assertEquals(0, dealership.getCars().size());
    }

    @Test
    public void canBuyCar(){
        dealership.buyCar(car);
        assertEquals(1, dealership.getCars().size());
        assertEquals(10000, dealership.getTill(), 0.00);
    }

    @Test
    public void canSellCar(){
        dealership.buyCar(car);
        dealership.sellCar(car);
        assertEquals(0, dealership.getCars().size());
        assertEquals(30000, dealership.getTill(), 0.00);
    }

    @Test
    public void canPayForRepairs(){
        dealership.buyCar(car);
        car.setDamage(4000.00);
        dealership.payForRepairs(car);
        assertEquals(0, car.getDamage(), 0);
        assertEquals(6000, dealership.getTill(), 0);
    }
}
