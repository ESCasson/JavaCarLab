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

}
