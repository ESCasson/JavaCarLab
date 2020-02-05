import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DealershipTest {
    Dealership dealership;
    @Before
    public void before(){
        dealership = new Dealership(3000.0);
    }
    @Test
    public void canGetTill(){
        assertEquals(3000.0, dealership.getTill(), 0.00);
    }
    @Test
    public void carsStartEmpty(){
        assertEquals(0, dealership.getCars().size());
    }
    @Test
    public void canBuyCar(){
        dealership.buyCar(1);
        assertEquals(1, dealership.getCars().size());
    }
    @Test
    public void canSellCar(){
        dealership.buyCar(1);
        dealership.sellCar(1);
        assertEquals(0, dealership.getCars().size());
    }
    @Test
    public void canPayForRepairs(){
        dealership.buyCar(1);
        dealership.payForRepairs(100);
        assertEquals(2899.0, dealership.getTill(), 0);
    }
}
