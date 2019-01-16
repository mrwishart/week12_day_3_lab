package dealership;

public class Till {

    private double wallet;

    public Till(double wallet) {
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public void addMoney(double amount){
        if (amount > 0) { wallet += amount; }
    }

    public void removeMoney(double amount){
        if (amount > 0 && amount <= this.wallet){wallet -= amount;}
    }


}
