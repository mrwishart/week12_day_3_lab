package stock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VanTest {

    Van van;

    @Before
    public void setUp(){
        van = new Van (EngineType.HYBRID, ColoursType.BLUE, 12300.25, MakeType.FIAT, "Emily Ratajkowski", 4, true, 5, 5, 5.25, 2500.5);
    }

    @Test
    public void getMaxLoad() {
        assertEquals(2500.5, van.getMaxLoad(), 0.01);
    }
}