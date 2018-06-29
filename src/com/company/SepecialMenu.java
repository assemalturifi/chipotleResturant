package com.company;

public class SepecialMenu extends BasicRiceBowl{
    public SepecialMenu() {
        super("Menu ", "lamb", 7.0, "bulgur");
        super.addBowlAddition1("chips",1.99);
        super.addBowlAddition2("drink",1.98);
    }

    @Override
    public void addBowlAddition1(String additionName, double price) {
        System.out.println("Cannot add additional items to Menu Rice bowl ");
    }

    @Override
    public void addBowlAddition2(String additionName, double price) {
        System.out.println("Cannot add additional items to Menu Rice bowl ");
    }

    @Override
    public void addBowlAddition3(String additionName, double price) {
        System.out.println("Cannot add additional items to Menu Rice bowl ");
    }

    @Override
    public void addBowlAddition4(String additionName, double price) {
        System.out.println("Cannot add additional items to Menu Rice bowl ");
    }
}
