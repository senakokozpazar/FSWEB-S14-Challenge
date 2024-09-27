package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = this.getPrice();
        if (this.getAddition1Name() != null) {
            totalPrice += this.getAddition1Price();
        }
        if (this.getAddition2Name() != null) {
            totalPrice += this.getAddition2Price();
        }
        if (this.getAddition3Name() != null) {
            totalPrice += this.getAddition3Price();
        }
        if (this.getAddition4Name() != null) {
            totalPrice += this.getAddition4Price();
        }
        if (this.healthyExtra1Name != null) {
            totalPrice += this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            totalPrice += this.healthyExtra2Price;
        }
        System.out.println("Name: " + this.getName());
        System.out.println("Meat: " + this.getMeat());
        System.out.println("BreadRollType: " + this.getBreadRollType());
        if (this.getAddition1Name() != null) {
            System.out.println("Addition1: " + this.getAddition1Name());
        }
        if (this.getAddition2Name() != null) {
            System.out.println("Addition2: " + this.getAddition2Name());
        }
        if (this.getAddition3Name() != null) {
            System.out.println("Addition3: " + this.getAddition3Name());
        }
        if (this.getAddition4Name() != null) {
            System.out.println("Addition4: " + this.getAddition4Name());
        }
        if (this.healthyExtra1Name != null) {
            System.out.println("HealthyAddition1: " + this.healthyExtra1Name);
        }
        if (this.healthyExtra2Name != null) {
            System.out.println("HealthyAddition2: " + this.healthyExtra2Name);
        }
        System.out.println("Price: " + totalPrice);
        return totalPrice;
    }
}
