package stock;

public class Motorbike extends Vehicle {
    public Motorbike(EngineType engine, ColoursType colour, Double basePrice, MakeType make, String model, Boolean isAutomatic) {
        super(engine, colour, basePrice, make, model, 2, isAutomatic);
    }
}
