package virtual_pet;

import java.util.Random;
import java.util.Scanner;

public class VirtualPetApplication {
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
        System.out.println(name + " is having a great time!");
    }

    public void sleep() {
        energy = 100;
        hunger += 10;
        if (hunger > 100) {
            hunger = 100;
        }
        System.out.println(name + " is well-rested!");
    }

    public void tick() {
        Random random = new Random();
        hunger += random.nextInt(10) + 1;
        happiness -= random.nextInt(5) + 1;
        energy -= random.nextInt(5) + 1;
    }

    public void checkStatus() {
        System.out.println("Name: " + name);
        System.out.println("Hunger: " + hunger);
        System.out.println("Happiness: " + happiness);
        System.out.println("Energy: " + energy);
    }

    public static void main(String[] args) {
        VirtualPet pet = new VirtualPet("name");
        pet.feed();
        pet.play();

    }
}