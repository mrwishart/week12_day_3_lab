package stock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    Motorbike motorbike;

    @Before
    public void setUp() {
        motorbike = new Motorbike(EngineType.PETROL, ColoursType.VERMILLION, 10988.00, MakeType.SUZUKI, "ABIKE", false);
    }

    @Test
    public void getEngine() {
        assertEquals(EngineType.PETROL, motorbike.getEngine());
    }

    @Test
    public void getColour() {
        assertEquals(ColoursType.VERMILLION, motorbike.getColour());
    }

    @Test
    public void getBasePrice() {
        assertEquals(10988.00, motorbike.getBasePrice(), 0.01);
    }

    @Test
    public void getMake() {
        assertEquals(MakeType.SUZUKI, motorbike.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("ABIKE", motorbike.getModel());
    }

    @Test
    public void getNoOfWheels() {
        assertEquals(2, motorbike.getNoOfWheels());
    }

    @Test
    public void getAutomatic() {
        assertFalse(motorbike.getAutomatic());
    }

    @Test
    public void setBasePrice() {
        motorbike.setBasePrice(5.50);
        assertEquals(5.50, motorbike.getBasePrice(), 0.01);
    }
}