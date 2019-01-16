package dealership;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TillTest {

    Till till;

    @Before
    public void setUp(){
        till = new Till(12000.00);
    }

    @Test
    public void getWallet() {
        assertEquals(12000, till.getWallet(), 0.01);
    }

    @Test
    public void addMoney() {
        till.addMoney(1000.05);
        assertEquals(13000.05, till.getWallet(), 0.01);
    }

    @Test
    public void removeMoney() {
        till.removeMoney(2000);
        assertEquals(10000, till.getWallet(), 0.01);
    }

    @Test
    public void cantAddNegativeMoney(){
        till.addMoney(-5000);
        assertEquals(12000, till.getWallet(), 0.01);
    }

    @Test
    public void cantRemoveNegativeMoney(){
        till.removeMoney(-5000);
        assertEquals(12000, till.getWallet(), 0.01);
    }

    @Test
    public void cantRemoveMoreThanInTill(){
        till.removeMoney(13000);
        assertEquals(12000, till.getWallet(), 0.01);
    }
}