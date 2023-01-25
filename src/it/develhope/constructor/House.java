package it.develhope.constructor;

/**
 * This class describes a house.
 * @author Mr Wolf
 */
public class House {
    // instance variables
    String address;
    int numberOfFloors;

    /**
     * Constructor method: creates a House object and prints a message in console
     */

    public House(String address, int numberOfFloors) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("A new house has been created!");
    }
}
