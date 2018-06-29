package com.company;

public class BasicRiceBowl {
    private String name;
    private String meat;
    private double price;
    private String riceType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public BasicRiceBowl(String name) {
        this.name = name;
    }

    public BasicRiceBowl(String name, String meat, double price, String riceType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.riceType = riceType;
    }

    public void addBowlAddition1 (String additionName, double price){
        this.addition1Name=additionName;
        this.addition1Price=price;

    }
    public void addBowlAddition2 (String additionName, double price){
        this.addition2Name=additionName;
        this.addition2Price=price;

    }
    public void addBowlAddition3 (String additionName, double price){
        this.addition3Name=additionName;
        this.addition3Price=price;

    }
    public void addBowlAddition4 (String additionName, double price){
        this.addition4Name=additionName;
        this.addition4Price=price;

    }
    public double calculateTotalPrice(){
        double riceBowlPrice=this.price;
        System.out.println(this.name+" rice bowl on a "+this.riceType+" rice "+" with "+this.meat+". The basic price is "+this.price);
        if(addition1Name!=null){
            riceBowlPrice+=this.addition1Price;
            System.out.println("Added "+this.addition1Name+" with an extra "+this.addition1Price+" price");

        }
        if(addition2Name!=null){
            riceBowlPrice+=this.addition2Price;
            System.out.println("Added "+this.addition2Name+" with an extra "+this.addition2Price+" price");
        }
        if(addition3Name!=null){
            riceBowlPrice+=this.addition3Price;
            System.out.println("Added "+this.addition3Name+" with an extra "+this.addition3Price+" price");

        }
        if(addition4Name!=null){
            riceBowlPrice+=this.addition4Price;
            System.out.println("Added "+this.addition4Name+" with an extra "+this.addition4Price+" price");

        }
        return riceBowlPrice;

    }

}
