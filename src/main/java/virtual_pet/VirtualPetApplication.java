package virtual_pet;

import java.util.Random;
import java.util.Scanner;

public class VirtualPetApplication {
    private String name;
    private int hunger;
    private int happiness;
    private int energy;

    public VirtualPetApplication(String name) {
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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Virtual Pet!");
        System.out.print("Enter a name for your pet: ");
        String petName = scanner.nextLine();

        VirtualPetApplication virtualPet = new VirtualPetApplication(petName);

        System.out.println("Commands: feed, play, sleep, status, quit");

        String command;
        do {
            virtualPet.tick();

            System.out.print("\nEnter a command: ");
            command = scanner.nextLine();

            if (command.equals("feed")) {
                virtualPet.feed();
            } else if (command.equals("play")) {
                virtualPet.play();
            } else if (command.equals("sleep")) {
                virtualPet.sleep();
            } else if (command.equals("status")) {
                virtualPet.checkStatus();
            } else if (command.equals("quit")) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid command. Try again.");
            }
        } while (!command.equals("quit"));

        scanner.close();
    }
}
