package virtual_pet;

public class VirtualPetApplication {
    public static void main(String[] args) {
        VirtualPet pet = new VirtualPet("name");
        pet.feed();
        pet.play();

    }
}