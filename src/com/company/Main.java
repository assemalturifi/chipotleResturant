package com.company;
//The purpose of the application is to help Chipotle to manage their process of selling their rice bowls.
//Our applicatuion will help customer to select types of bowls, some of the additional
// items(additions)to be added to bowls and pricing
//we want to create a base rice bowl, but also two other types of rice bowls that are popular
//The basic rice bowl should have the following items

//rice type, meat and up to 4 additions(things like lettuce, tomato, carrot,etc)that
//the customer can select to be added to the bowl.

//Each one of these items gets charged an additional price so you need some way to track
// how many items got added and to calculate the final price (base rice bowl with all the additions.)

//This rice bowl has a base price and the additions are all separately priced(up to 4 additions, see above.)
//Create rice bowl class to deal with all the above.

//The constructor should only include the name, rice type, meat and price

//Also create two extra varieties of rice bowls(subclasses) to cater for
//a)Healthy rice bowl(on a brown type rice), plus two addition items that can be added.

//The healthy rice bowl can have 6 items (Additions)in total.
//hint:you probably want to process the two additionals are only appropriate for this new class
//(subclass of rice bowl), not the base class (rice bowl), since the two additions are only appropriate for
// this new class

//b)Rice bowl menu-comes with chips and drinks as additions, but no extra additions are allowed.
//hint:you have to find a way automatically add these new additions, but no extra additions are allowed.
//Object is created, and then prevent other additions being made.
//All 3 classes should have a method that can be called anytime to show the base price of the rice bowl
//plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
//rice bowl (base price +all additions)
//For the two additional classes this may require you to be looking at the base class for pricing and then
//adding totals to final price.
import java.util.Scanner;
public class Main {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        BasicRiceBowl basicRiceBowl=new BasicRiceBowl("basic");
        HealthyRiceBowl healthyRiceBowl=new HealthyRiceBowl("healthy", 2223);

        boolean quit=false;
        printAction();
        while(!quit){

            int action=scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit=true;
                    break;
                case 1:
                    basicRiceBowl(basicRiceBowl);
                    break;
                case 2:
                    healthyRiceBowl(healthyRiceBowl);
                    break;
                case 3:
                    SepecialMenu MenuRiceBowl=new SepecialMenu();
                     System.out.println("The total price is "+MenuRiceBowl.calculateTotalPrice());
                    break;
                case 4:
                    printAction();
                    break;
            }
        }
    }
    public static void printAction(){
        System.out.println("\n Available actions:\npress");
        System.out.println("0 - to shutdown\n"+
                "1 - choose Basic rice bowl\n"+
                "2 - choose Healthy rice bowl\n"+
                "3 - choose special menu bowl\n"+
                "4 - to print a list of acailable actions.");
        System.out.println("Choose your action: ");
    }

    public static void healthyRiceBowl(HealthyRiceBowl basic){
        HealthyRiceBowl healthyRiceBowl=new HealthyRiceBowl("chicken",6.16);

        boolean quit=false;
        while(!quit) {
            System.out.println("You selected healthy rice bowl\n" +
                    "If you Dont want to add anything click 0\n"+
                    "If you want to add lettuce, click 1\n" +
                    "If you want to add tomato click 2\n" +
                    "If you want to add both click 3");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    healthyRiceBowl.calculateTotalPrice();
                    quit = true;
                    break;
                case 1:
                    healthyRiceBowl.addBowlAddition1("lettuce", 1.11);
                    System.out.println("The total price with additional prices is " + healthyRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                case 2:
                    healthyRiceBowl.addBowlAddition2("tomato", 1.15);
                    System.out.println("The total price with additional prices is " + healthyRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                case 3:
                    healthyRiceBowl.addBowlAddition1("lettuce", 1.11);
                    healthyRiceBowl.addBowlAddition2("tomato", 1.15);
                    System.out.println("The total price with additional prices is " + healthyRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
            }

        }
    }
    public static void basicRiceBowl(BasicRiceBowl basic){
        BasicRiceBowl basicRiceBowl=new BasicRiceBowl("Basic","chicken",5.26,"white");
        System.out.println("You selected basic rice bowl!");

        boolean quit=false;
        while(!quit){

            System.out.println("Answer by writing yes or no!\n"+"Do you want to add anything ?");
            String a=scanner.nextLine();

            if(a.equalsIgnoreCase("no")){
                basicRiceBowl.calculateTotalPrice();
                quit=true;
                break;
            }
            else{

                System.out.println("Do you want to add lettuce?");

                String b=scanner.nextLine();

                System.out.println("Do you want to add tomato?");

                String c=scanner.nextLine();

                System.out.println("Do you want to add avocado?");

                String d=scanner.nextLine();

                System.out.println("Do you want to add cheese?");

                String e=scanner.nextLine();

                if(b.equalsIgnoreCase("yes")&&c.equalsIgnoreCase("Yes")&&d.equalsIgnoreCase("yes")&&e.equalsIgnoreCase("Yes")){
                    basicRiceBowl.addBowlAddition1("lettuce", 1.11);
                    basicRiceBowl.addBowlAddition2("tomato", 1.15);
                    basicRiceBowl.addBowlAddition3("avocado", 1.66);
                    basicRiceBowl.addBowlAddition4("cheese", 1.98);
                    System.out.println("The total price with additional prices is " + basicRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                }
                if(b.equalsIgnoreCase("yes")&&c.equalsIgnoreCase("Yes")&&d.equalsIgnoreCase("yes")&&e.equalsIgnoreCase("no")){
                    basicRiceBowl.addBowlAddition1("lettuce", 1.11);
                    basicRiceBowl.addBowlAddition2("tomato", 1.15);
                    basicRiceBowl.addBowlAddition3("avocado", 1.66);
                    System.out.println("The total price with additional prices is " + basicRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                }
                if(b.equalsIgnoreCase("yes")&&c.equalsIgnoreCase("Yes")&&d.equalsIgnoreCase("no")&&e.equalsIgnoreCase("yes")){
                    basicRiceBowl.addBowlAddition1("lettuce", 1.11);
                    basicRiceBowl.addBowlAddition2("tomato", 1.15);
                    basicRiceBowl.addBowlAddition4("cheese", 1.98);
                    System.out.println("The total price with additional prices is " + basicRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                }
                if(b.equalsIgnoreCase("yes")&&c.equalsIgnoreCase("no")&&d.equalsIgnoreCase("yes")&&e.equalsIgnoreCase("yes")){
                    basicRiceBowl.addBowlAddition1("lettuce", 1.11);
                    basicRiceBowl.addBowlAddition3("avocado", 1.66);
                    basicRiceBowl.addBowlAddition4("cheese", 1.98);
                    System.out.println("The total price with additional prices is " + basicRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                }
                if(b.equalsIgnoreCase("yes")&&c.equalsIgnoreCase("no")&&d.equalsIgnoreCase("yes")&&e.equalsIgnoreCase("no")){
                    basicRiceBowl.addBowlAddition1("lettuce", 1.11);
                    basicRiceBowl.addBowlAddition3("avocado", 1.66);
                    System.out.println("The total price with additional prices is " + basicRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                }
                if(b.equalsIgnoreCase("yes")&&c.equalsIgnoreCase("no")&&d.equalsIgnoreCase("no")&&e.equalsIgnoreCase("yes")){
                    basicRiceBowl.addBowlAddition1("lettuce", 1.11);
                    basicRiceBowl.addBowlAddition4("cheese", 1.98);
                    System.out.println("The total price with additional prices is " + basicRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                }
                if(b.equalsIgnoreCase("yes")&&c.equalsIgnoreCase("no")&&d.equalsIgnoreCase("no")&&e.equalsIgnoreCase("no")){
                    basicRiceBowl.addBowlAddition1("lettuce", 1.11);
                    System.out.println("The total price with additional prices is " + basicRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                }
                if(b.equalsIgnoreCase("no")&&c.equalsIgnoreCase("Yes")&&d.equalsIgnoreCase("yes")&&e.equalsIgnoreCase("yes")){

                    basicRiceBowl.addBowlAddition2("tomato", 1.15);
                    basicRiceBowl.addBowlAddition3("avocado", 1.66);
                    basicRiceBowl.addBowlAddition4("cheese", 1.98);
                    System.out.println("The total price with additional prices is " + basicRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                }
                if(b.equalsIgnoreCase("no")&&c.equalsIgnoreCase("Yes")&&d.equalsIgnoreCase("yes")&&e.equalsIgnoreCase("no")){

                    basicRiceBowl.addBowlAddition2("tomato", 1.15);
                    basicRiceBowl.addBowlAddition3("avocado", 1.66);
                    System.out.println("The total price with additional prices is " + basicRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                }
                if(b.equalsIgnoreCase("no")&&c.equalsIgnoreCase("Yes")&&d.equalsIgnoreCase("no")&&e.equalsIgnoreCase("yes")){

                    basicRiceBowl.addBowlAddition2("tomato", 1.15);
                    basicRiceBowl.addBowlAddition4("cheese", 1.98);
                    System.out.println("The total price with additional prices is " + basicRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                }
                if(b.equalsIgnoreCase("no")&&c.equalsIgnoreCase("no")&&d.equalsIgnoreCase("yes")&&e.equalsIgnoreCase("yes")){
                    basicRiceBowl.addBowlAddition3("avocado", 1.66);
                    basicRiceBowl.addBowlAddition4("cheese", 1.98);
                    System.out.println("The total price with additional prices is " + basicRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                }
                if(b.equalsIgnoreCase("no")&&c.equalsIgnoreCase("no")&&d.equalsIgnoreCase("yes")&&e.equalsIgnoreCase("no")){

                    basicRiceBowl.addBowlAddition3("avocado", 1.66);
                    System.out.println("The total price with additional prices is " + basicRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                }
                if(b.equalsIgnoreCase("no")&&c.equalsIgnoreCase("no")&&d.equalsIgnoreCase("no")&&e.equalsIgnoreCase("yes")){

                    basicRiceBowl.addBowlAddition4("cheese", 1.98);
                    System.out.println("The total price with additional prices is " + basicRiceBowl.calculateTotalPrice() + "\n");
                    quit=true;
                    break;
                }

        }
            }
            }
}
