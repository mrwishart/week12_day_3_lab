package stock;

public class Van extends Enclosed {

    public Van(EngineType engine, ColoursType colour, Double basePrice, MakeType make, String model, int noOfWheels, Boolean isAutomatic) {
        super(engine, colour, basePrice, make, model, noOfWheels, isAutomatic);
    }
}
