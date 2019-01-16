package stock;

public abstract class Enclosed extends Vehicle {

    private int noOfDoors, noOfSeats;
    private double storageVolume;

    public Enclosed(EngineType engine, ColoursType colour, Double basePrice, MakeType make, String model, int noOfWheels, Boolean isAutomatic, int noOfDoors, int noOfSeats, double storageVolume) {
        super(engine, colour, basePrice, make, model, noOfWheels, isAutomatic);
        this.noOfDoors = noOfDoors;
        this.noOfSeats = noOfSeats;
        this.storageVolume = storageVolume;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public double getStorageVolume() {
        return storageVolume;
    }
}
