package com.workintech.burgercompany;
import com.workintech.burgercompany.BreadRollType;

import java.util.Arrays;
import java.util.Objects;

public class Hamburger implements Adable{

    private String name;
    private String meat;
    private BreadRollType breadRollType;
    private double price;

    private Addition[] additions;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, BreadRollType breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        this.additions = new Addition[4];
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public Addition[] getAdditions() {
        return additions;
    }



    @Override
    public void addAddition(String name, double price) {
        for (int i = 0; i < additions.length; i++) {
            if (additions[i] == null) {
                additions[i] = new Addition(name, price);
                break;
            }

        }
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void itemizeHamburger (){
       StringBuilder builder = new StringBuilder();
       builder.append("Name: "+ name + "\n");
       builder.append("Meat: "+meat + "\n" );
       builder.append("Bread Roll Type: "+ breadRollType + "\n");

       for(Addition addition: additions){
           if(addition != null){
               builder.append("Addition: "+addition.getName() + "\n");
               price += addition.getPrice();
           }
       }
            System.out.println(builder);
            System.out.println("Total Price: " + price);
            System.out.println("................................");
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", breadRollType=" + breadRollType +
                ", price=" + price +
                ", additions=" + Arrays.toString(additions) +
                ", addition1Name='" + addition1Name + '\'' +
                ", addition1Price=" + addition1Price +
                ", addition2Name='" + addition2Name + '\'' +
                ", addition2Price=" + addition2Price +
                ", addition3Name='" + addition3Name + '\'' +
                ", addition3Price=" + addition3Price +
                ", addition4Name='" + addition4Name + '\'' +
                ", addition4Price=" + addition4Price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamburger hamburger = (Hamburger) o;
        return Objects.equals(name, hamburger.name);
    }


}
