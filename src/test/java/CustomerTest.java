import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;
    private Car car;
    @Before
    public void before()
    {
        car = new Car("Vauxhall", "Little", 4, "Blue", 0, 100);
        customer = new Customer(300);
    }


    @Test
    public void doesHaveMoney(){
        assertEquals(300, customer.getMoney(), 2d);
    }

    @Test
    public void doesHaveOwnedCarArray(){
        assertEquals(0, customer.countCarsOwned());
    }

    @Test
    public void canAddCarToOwnedCarArray(){
        customer.addCar(car);
        assertEquals(1, customer.countCarsOwned());
    }

    @Test
    public void canRemoveMoney(){
        customer.removeMoney(100);
        assertEquals(200, customer.getMoney(), 2d);
    }

    @Test
    public void canBuyCar(){

        customer.buyCar(car);
        assertEquals(200, customer.getMoney(), 2d);
        assertEquals(1, customer.countCarsOwned());


    }

}
