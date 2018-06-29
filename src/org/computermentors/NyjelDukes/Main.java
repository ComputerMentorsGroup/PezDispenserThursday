package org.computermentors.NyjelDukes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("We are creating a new Pez Dispenser");

        PezDispenser dispenser = new PezDispenser("Virgil Hawkins aka Static");
        // %s is placeholder for string
        // %n is for new line
        System.out.printf("The character is %s %n", dispenser.getCharacterName());

        //If statement checks to see if dispenser is empty.
        //If empty then fill dispenser.
        if(dispenser.isEmpty()){
            System.out.println("Dispenser is empty. Filling dispenser.");
            dispenser.fill();
        }

        while(dispenser.dispense()){
            System.out.println("Chomp");
        }

        System.out.println("We ate all the PEZ...");
    }
}
