import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;
    @Before
    public void before(){
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
        customer.addCar(1);
        assertEquals(1, customer.countCarsOwned());
    }

    @Test
    public void canRemoveMoney(){
        customer.removeMoney(100);
        assertEquals(200, customer.getMoney(), 2d);
    }

    @Test
    public void canBuyCar(){
        int car = 1;
        double value = 50;
        customer.buyCar(1,50);
        assertEquals(250, customer.getMoney(), 2d);
        assertEquals(1, customer.countCarsOwned());


    }

}
