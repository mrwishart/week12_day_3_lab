package stock;

public class Car extends Enclosed {

    public Car(EngineType engine, ColoursType colour, Double basePrice, MakeType make, String model, int noOfWheels, Boolean isAutomatic, int noOfDoors, int noOfSeats, double storageVolume) {
        super(engine, colour, basePrice, make, model, noOfWheels, isAutomatic, noOfDoors, noOfSeats, storageVolume);
    }
}
