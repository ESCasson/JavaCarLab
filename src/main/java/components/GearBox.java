package components;

public class GearBox extends Components {

    private String transmission;

    public GearBox(String make, String model, String transmission) {
        super(make, model);
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }
}
