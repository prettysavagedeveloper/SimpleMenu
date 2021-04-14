package com.prettysavagedeveloper;

public class Order {
    /* Display all the menu in the restaurant */

    public void displayAvailableMenu(){

        System.out.println("Menu choice");
        System.out.println("Menu 1: Rendang Beef");
        System.out.println("Menu 2: Nasi Lemak");
        System.out.println("Menu 3: Mee Goreng");
        System.out.println("Which menu you desired?");
    }
    /*Display the selected menu */
    public void displaySelectedMenu(int nbMenu){
        System.out.println("You have choosen Menu " + nbMenu);
    }
}