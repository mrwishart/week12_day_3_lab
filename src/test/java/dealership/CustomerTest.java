package dealership;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() {
        customer = new Customer(50000.00, "Paul");
    }

    @Test
    public void getWallet() {
        assertEquals(50000.00, customer.getWallet(), 0.01);
    }

    @Test
    public void getName() {
        assertEquals("Paul", customer.getName());
    }

    @Test
    public void canAddMoney(){
        customer.addMoney(20000.00);
        assertEquals(70000.00, customer.getWallet(), 0.01);
    }

    @Test
    public void canRemoveMoney(){
        customer.removeMoney(49999.00);
        assertEquals(1.00, customer.getWallet(), 0.01);
    }

    @Test
    public void cannotAddNegativeMoney(){
        customer.addMoney(-20000.00);
        assertEquals(50000.00, customer.getWallet(), 0.01);
    }

    @Test
    public void cannotRemoveNegativeMoney(){
        customer.removeMoney(-49999.00);
        assertEquals(50000.00, customer.getWallet(), 0.01);
    }

    @Test
    public void cannotRemoveMoreThanInWallet(){
        customer.removeMoney(70000.00);
        assertEquals(50000.00, customer.getWallet(), 0.01);
    }
}