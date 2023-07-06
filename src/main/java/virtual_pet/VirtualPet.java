package virtual_pet;
import java.util.Random;
import java.util.Scanner;

 
public class VirtualPet {
    private String name;
    private int hunger;
    private int happiness;
    private int energy;

    public VirtualPet(String name) {
        this.name = name;
        hunger = 0;
        happiness = 0;
        energy = 100;
    }

    public void feed() {
        hunger -= 10;
        if (hunger < 0) {
            hunger = 0;
        }
        happiness += 5;
        if (happiness > 100) {
            happiness = 100;
        }
        System.out.println("Tasty! " + name + " is happy!");
    }

    public void play() {
        happiness += 10;
        if (happiness > 100) {
            happiness = 100;
        }
        energy -= 20;
        if (energy < 0) {
            energy = 0;
        }
        System.out.println(name + " is having fun!");
    }
}
