package com.prettysavagedeveloper;

import java.util.Scanner;

public class Order {
    /* Display all the menu in the restaurant */

    public void displayAvailableMenu() {

        System.out.println("Menu choice");
        System.out.println("Menu 1: Beef Rendang");
        System.out.println("Menu 2: Nasi Lemak");
        System.out.println("Menu 3: Mee Goreng");
        System.out.println("Which menu you desired?");
    }

    /*Display the selected menu */
    public void displaySelectedMenu(int nbMenu) {
        switch (nbMenu) {
            case 1:
                System.out.println("You have chosen Menu Beef Rendang");
                break;
            case 2:
                System.out.println("You have chosen Menu Nasi Lemak");
                break;
            case 3:
                System.out.println("You have chosen Menu Mee Goreng");
                break;
            default:
                System.out.println("Your request is unavailable. Please choose your menu");
                break;
        }
    }

    /* fetch customer command */
    public void runMenu(){
        this.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        this.displaySelectedMenu(nb);
    }

    public void displaySelectedKuih(int nbKuih, boolean allKuihAvailable) {
        if(allKuihAvailable){
            switch (nbKuih){
                case 1:
                    System.out.println("You have chosen karipap");
                    break;
                case 2:
                    System.out.println("You have chosen pisang goreng");
                    break;
                case 3:
                    System.out.println("You have chosen donut");
                    break;
                default:
                    System.out.println("Unavailable");
                    break;
            }
        }
        else {
            switch (nbKuih){
                case 1:
                    System.out.println("You have chosen donut");
                    break;
                case 2:
                    System.out.println("No donut");
                    break;
                default:
                    System.out.println("Unavailable");
                    break;
            }
        }
    }

   public void displaySelectedDrinks(int nbDrink) {
        switch (nbDrink){
            case 1:
                System.out.println("You have chosen teh tarik");
                break;
            case 2:
                System.out.println("You have chosen milo ais");
                break;
            case 3:
                System.out.println("You have chosen soya cincau");
                break;
            default:
                System.out.println("choice unavailable");
                break;
        }
    }
}