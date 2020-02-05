import components.Components;

import java.util.ArrayList;

public class Car {

    private String make;
    private String model;
    private int doors;
    private String colour;
    private double damage;
    private int price;
    private ArrayList<Components> components;

    public Car(String make, String model, int doors, String colour, int damage, int price) {
        this.make = make;
        this.model = model;
        this.doors = doors;
        this.colour = colour;
        this.damage = damage;
        this.price = price;
        this.components = new ArrayList<>();
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getDoors() {
        return this.doors;
    }

    public String getColour() {
        return this.colour;
    }

    public double getDamage() {
        return this.damage;
    }

    public double getPrice() {
        return this.price;
    }

    public void setColour(String newColour) {
        this.colour = newColour;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    public void setDamage(double newDamage) {
        this.damage += newDamage;
    }

    // adds value of repairs to car price value
    // will need to subtract value of damage from dealership till - GS
    public void repair() {
        this.price += this.damage;
        this.damage = 0;
    }


    public int getComponentCount() {
        return this.components.size();
    }

    public void addComponent(Components newComponent) {
        this.components.add(newComponent);
    }
}
