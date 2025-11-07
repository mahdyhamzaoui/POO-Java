package main;

import entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Jungle Paradise", "Tunis");
        System.out.println(myZoo);

        Terrestrial cheetah = new Terrestrial("Cheetah", "Haaland", 3, true, 4);
        Terrestrial lion = new Terrestrial("Lion", "Mané", 7, true, 4);
        Terrestrial giraffe = new Terrestrial("Giraffe", "Mbappé", 5, true, 4);
        Terrestrial bear = new Terrestrial("Bear", "Messi", 8, true, 4);

        Dolphin dolphin = new Dolphin("Dolphin", "Neymar Jr", 9, true, "Tropical", 48);
        Penguin penguin = new Penguin("Penguin", "Harry Kane", 6, false, "Antarctic", 300);
        Dolphin dolphin2 = new Dolphin("Dolphin", "Pelé", 15, true, "Tropical", 55);
        Penguin penguin2 = new Penguin("Penguin", "Maradona", 10, false, "Antarctic", 250);
        Penguin penguin3 = new Penguin("Penguin", "Maradona", 10, false, "Antarctic", 250);


        System.out.println("\n--- Ajout d'animaux terrestres ---");
        try {
            myZoo.addAnimal(cheetah);
            myZoo.addAnimal(lion);
            myZoo.addAnimal(giraffe);
            myZoo.addAnimal(bear);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Ajout d'animaux aquatiques ---");
        try {
            myZoo.addAquaticAnimal(dolphin);
            myZoo.addAquaticAnimal(penguin);
            myZoo.addAquaticAnimal(dolphin2);
            myZoo.addAquaticAnimal(penguin2);
            myZoo.addAquaticAnimal(penguin3);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n" + myZoo);

        myZoo.displayAnimals();

        myZoo.displayAquaticAnimals();

        for (int i = 0; i < myZoo.getAquaticsAnimals().length; i++) {
            Aquatic aquatic = myZoo.getAquaticsAnimals()[i];
            if (aquatic != null) {
                aquatic.swim();
            }
        }

        System.out.println("La profondeur maximale des penguins est : " + myZoo.maxPenguinDepthSwimming());

        myZoo.displayNumberOfAquaticsByType();

        System.out.println(myZoo.getAquaticsAnimals()[0].equals(myZoo.getAquaticsAnimals()[1]));
        System.out.println(myZoo.getAquaticsAnimals()[3].equals(myZoo.getAquaticsAnimals()[4]));
    }
}