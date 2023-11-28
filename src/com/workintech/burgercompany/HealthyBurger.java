package com.workintech.burgercompany;

public class HealthyBurger extends Hamburger{


    private Addition healthyAddition1;
    private Addition healthyAddition2;


    public HealthyBurger(String name, BreadRollType breadRollType, double price) {
        super(name, "Tofu", breadRollType, price);
    }

    public Addition getHealthyAddition1() {
        return healthyAddition1;
    }

    public Addition getHealthyAddition2() {
        return healthyAddition2;
    }

    public void addHealthyAddition(String name, double price){
        if (healthyAddition1 == null){
            healthyAddition1 = new Addition(name,price);
        } else if(healthyAddition2 == null) {
            healthyAddition2 = new Addition(name,price);
        }

    }

    @Override
    public void itemizeHamburger() {

        StringBuilder builder = new StringBuilder();

        if (getHealthyAddition1() != null){
            builder.append("HealthyAddition: "+getHealthyAddition1().getName()+"\n");
            setPrice(getPrice() + getHealthyAddition1().getPrice());}
        if (getHealthyAddition2() != null){
            builder.append("HealthyAddition: "+getHealthyAddition2().getName()+"\n");
            setPrice(getPrice() + getHealthyAddition2().getPrice());}

        System.out.println("\n"+builder);

        super.itemizeHamburger();
    }
}
