package stock;

public abstract class Vehicle {
    private EngineType engine;
    private ColoursType colour;
    private Double basePrice;
    private MakeType make;
    private String model;
    private int noOfWheels;
    private Boolean isAutomatic;

    public Vehicle(EngineType engine, ColoursType colour, Double basePrice, MakeType make, String model, int noOfWheels, Boolean isAutomatic) {
        this.engine = engine;
        this.colour = colour;
        this.basePrice = basePrice;
        this.make = make;
        this.model = model;
        this.noOfWheels = noOfWheels;
        this.isAutomatic = isAutomatic;
    }

    public EngineType getEngine() {
        return engine;
    }

    public ColoursType getColour() {
        return colour;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public MakeType getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public Boolean getAutomatic() {
        return isAutomatic;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }
}
