package com.company;

public class HealthyRiceBowl extends BasicRiceBowl{

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;


    public HealthyRiceBowl(String meat, double price) {
        super("Healthy", meat, price, "Brown");
    }

    public void addHealthyBowlAddition1 (String additionName, double price){
        this.addition1Name=additionName;
        this.addition1Price=price;

    }
    public void addHealthyBowlAddition2 (String additionName, double price){
        this.addition2Name=additionName;
        this.addition2Price=price;

    }

    @Override
    public double calculateTotalPrice() {
        double riceBowlPrice=super.calculateTotalPrice();
        if(this.addition1Name!=null){
            riceBowlPrice+=this.addition1Price;
            System.out.println("Added "+this.addition1Name+" for an extra "+this.addition1Price);

        }
        if(this.addition2Name!=null){
            riceBowlPrice+=this.addition2Price;
            System.out.println("Added "+this.addition2Name+" for an extra "+this.addition2Price);

        }
        return riceBowlPrice;
    }
    }
