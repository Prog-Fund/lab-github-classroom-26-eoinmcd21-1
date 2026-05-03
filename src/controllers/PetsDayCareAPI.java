
package controllers;

import models.*;
import java.util.ArrayList;

public class PetsDayCareAPI {

    private ArrayList<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public ArrayList<Pet> getAllPets() {
        return pets;
    }

    public int numberOfPets() {
        return pets.size();
    }

    public Pet findPetByName(String name) {
        for (Pet p : pets) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public boolean removePet(String name) {
        Pet p = findPetByName(name);
        if (p != null) {
            pets.remove(p);
            return true;
        }
        return false;
    }
}
