package stock;

public abstract class Enclosed extends Vehicle {

    public Enclosed(EngineType engine, ColoursType colour, Double basePrice, MakeType make, String model, int noOfWheels, Boolean isAutomatic) {
        super(engine, colour, basePrice, make, model, noOfWheels, isAutomatic);
    }
}
