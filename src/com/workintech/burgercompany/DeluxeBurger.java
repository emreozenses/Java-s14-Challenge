package com.workintech.burgercompany;

public class DeluxeBurger extends Hamburger{

    private Drink drink;
    private Cips cips;

    public DeluxeBurger(Drink drink,Cips cips) {
        super("DELUXE BURGER", "DOUBLE", BreadRollType.DOUBLE, 19.10);
        this.drink =drink;
        this.cips=cips;
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("\nDeluxe Burger için ek malzeme eklenemez");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("DRINK: "+drink.getType()+"\n");
        builder.append("CIPS: "+ cips.getCipsType()+"\n");
        System.out.println(builder);
        super.itemizeHamburger();
    }
}

