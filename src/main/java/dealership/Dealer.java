package dealership;

import stock.Vehicle;

import java.util.ArrayList;

public class Dealer {

    ArrayList<Vehicle> vehicles;
    Till till;

    public Dealer(Till till) {
        this.till = till;
        this.vehicles = new ArrayList<>();
    }


}
