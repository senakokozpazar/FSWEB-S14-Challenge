package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;


    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    public DeluxeBurger(String name, String meat, String breadRollType) {
        super(name, meat, 19.10, breadRollType);
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Name: " + this.getName());
        System.out.println("Meat: " + this.getMeat());
        System.out.println("BreadRollType: " + this.getBreadRollType());
        System.out.println("Price: " + this.getPrice());
        return 0;
    }
}
