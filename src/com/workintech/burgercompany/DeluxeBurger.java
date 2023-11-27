package com.workintech.burgercompany;

public class DeluxeBurger extends Hamburger {

    private String drink;
    private String cips;
    public DeluxeBurger(String name, String meat, String breadRollType,String drink, double price) {
        super(name, meat, breadRollType, price);
        this.drink = drink;
        this.cips = "Classical";
        price = 19.80;
    }

    @Override
    public void addHamburgerAddition1() {
        System.out.println("Ek malzeme eklenemez!");
    }

    @Override
    public void addHamburgerAddition2() {
        System.out.println("Ek malzeme eklenemez!");
    }

    @Override
    public void addHamburgerAddition3() {
        System.out.println("Ek malzeme eklenemez!");
    }

    @Override
    public void addHamburgerAddition4() {
        System.out.println("Ek malzeme eklenemez!");
    }
}
