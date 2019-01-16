package dealership;

public class Customer {
    private Double wallet;
    private String name;

    public Customer(Double wallet, String name) {
        this.wallet = wallet;
        this.name = name;
    }

    public Double getWallet() {
        return wallet;
    }

    public String getName() {
        return name;
    }

    public void addMoney(double v) {
        if (v > 0) {wallet += v;}
    }

    public void removeMoney(double v) {
        if (v > 0 && v <= wallet) {wallet -= v;}
    }
}
