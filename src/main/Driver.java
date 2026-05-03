
package main;

import controllers.PetsDayCareAPI;
import models.*;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        PetsDayCareAPI api = new PetsDayCareAPI();
        Scanner sc = new Scanner(System.in);

        int option;

        do {
            System.out.println("\n1. Add Dog");
            System.out.println("2. Add Cat");
            System.out.println("3. Add Parrot");
            System.out.println("4. List Pets");
            System.out.println("5. Exit");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String dName = sc.nextLine();
                    System.out.print("Age: ");
                    int dAge = sc.nextInt();
                    api.addPet(new Dog(dName, dAge));
                    break;

                case 2:
                    System.out.print("Name: ");
                    String cName = sc.nextLine();
                    System.out.print("Age: ");
                    int cAge = sc.nextInt();
                    api.addPet(new Cat(cName, cAge));
                    break;

                case 3:
                    System.out.print("Name: ");
                    String pName = sc.nextLine();
                    System.out.print("Age: ");
                    int pAge = sc.nextInt();
                    api.addPet(new Parrot(pName, pAge));
                    break;

                case 4:
                    for (Pet p : api.getAllPets()) {
                        System.out.println(p);
                    }
                    break;
            }

        } while (option != 5);

        System.out.println("Goodbye!");
    }
}
