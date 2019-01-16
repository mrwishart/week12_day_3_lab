package stock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnclosedTest {

    Car car;

    @Before
    public void setUp() {
        car = new Car (EngineType.HYBRID, ColoursType.BLUE, 12300.25, MakeType.FIAT, "Emily Ratajkowski", 4, true, 5, 5, 5.25);

    }

    @Test
    public void getNoOfDoors() {
        assertEquals(5, car.getNoOfDoors());
    }

    @Test
    public void getNoOfSeats() {
        assertEquals(5, car.getNoOfSeats());
    }

    @Test
    public void getStorageVolume() {
        assertEquals(5.25, car.getStorageVolume(), 0.01);
    }
}