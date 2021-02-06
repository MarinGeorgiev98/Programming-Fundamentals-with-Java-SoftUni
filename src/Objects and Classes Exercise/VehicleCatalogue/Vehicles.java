package VehicleCatalogue;

public class Vehicles {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public int getHorsePower() {
        return horsePower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public Vehicles(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        String result = String.format("Type: %s%nModel: %s%n Color: %s%nHorsePower: %d",
                this.type, this.model, this.color, this.horsePower);
        return result;
    }
}