package stock;

public class Van extends Enclosed {

    private double maxLoad;

    public Van(EngineType engine, ColoursType colour, Double basePrice, MakeType make, String model, int noOfWheels, Boolean isAutomatic, int noOfDoors, int noOfSeats, double storageVolume, double maxLoad) {
        super(engine, colour, basePrice, make, model, noOfWheels, isAutomatic, noOfDoors, noOfSeats, storageVolume);
        this.maxLoad = maxLoad;
    }

    public double getMaxLoad() {
        return maxLoad;
    }
}
