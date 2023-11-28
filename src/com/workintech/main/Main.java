package com.workintech.main;

import com.workintech.burgercompany.*;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","NORMAL", BreadRollType.NORMAL,3.56);
        hamburger.addAddition("Tomato",0.27);
        hamburger.addAddition("Lettuce",0.75);
        hamburger.addAddition("Cheese",1.13);
        hamburger.addAddition("Pickle",1.13);
        hamburger.addAddition("Ham",1.50);
        hamburger.itemizeHamburger();

        System.out.println("*********************************");
        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger",BreadRollType.SANDWICH,5.67);
        healthyBurger.addHealthyAddition("Egg",5.43);
        healthyBurger.addHealthyAddition("Lentils",3.41);
        healthyBurger.itemizeHamburger();
        System.out.println("****************************************");

        DeluxeBurger db = new DeluxeBurger(new Drink(DrinkType.COKE),new Cips(CipsType.CURLY));
        db.addAddition("deneme",50.53);
        db.itemizeHamburger();





    }
}