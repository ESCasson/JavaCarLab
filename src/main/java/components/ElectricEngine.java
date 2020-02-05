package components;

import behaviour.IElectric;

public class ElectricEngine extends Components implements IElectric {

    private int chargeLevel;

    public ElectricEngine(String make, String model) {
        super(make, model);
        this.chargeLevel = 100;
    }

    public int getChargeLevel() {
        return this.chargeLevel;
    }

    public String drive(int charge) {
        this.chargeLevel -= charge;
        return "Hmmmmm";
    }

    public void plugIn() {
        this.chargeLevel = 100;
    }

    @Override
    public void addCharge(int amount) {
        this.chargeLevel = amount + this.chargeLevel;
    }
}





