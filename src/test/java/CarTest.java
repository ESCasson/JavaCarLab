import components.FuelEngine;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static junit.framework.TestCase.assertEquals;

public class CarTest {

    Car car;
    FuelEngine engine;

    @Before
    public void before() {
        car = new Car("Nissan", "Skyline", 3, "Midnight Purple II", 100, 20000);
        engine = new FuelEngine("Nissan", "R34 N1", "Petrol");
    }

    @Test
    public void canGetMake() {
        assertEquals("Nissan", car.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Skyline", car.getModel());
    }

    @Test
    public void canGetDoors() {
        assertEquals(3, car.getDoors());
    }

    @Test
    public void canGetColour() {
        assertEquals("Midnight Purple II", car.getColour());
    }

    @Test
    public void canGetDamage() {
        assertEquals(100, car.getDamage(), 0.00);
    }

    @Test
    public void canGetPrice() {
        assertEquals(20000, car.getPrice(), 0.00);
    }

    @Test
    public void canSetColour() {
        car.setColour("Millenium Jade");
        assertEquals("Millenium Jade", car.getColour());
    }

    @Test
    public void canSetPrice() {
        car.setPrice(25000);
        assertEquals(25000, car.getPrice(), 0.00);
    }

    @Test
    public void canSetDamage() {
        car.setDamage(5000);
        assertEquals(5100, car.getDamage(), 0.00);
    }

    @Test
    public void canRepair() {
        car.repair();
        assertEquals(20100, car.getPrice(), 0.00);
    }

    @Test
    public void canAddComponent() {
        car.addComponent(engine);
        assertEquals(1, car.getComponentCount());
    }
}
