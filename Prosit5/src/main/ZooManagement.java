package main;

import entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Terrestrial cheetah = new Terrestrial("Cheetah", "Erling Haaland", 3, true, 4);
        System.out.println(cheetah);

        Aquatic shark = new Aquatic("Shark", "Virgil van Dijk", 12, false, "Ocean");
        System.out.println(shark);
        shark.swim();

        Dolphin dolphin = new Dolphin("Dolphin", "Neymar Jr", 9, true, "Tropical", 48);
        System.out.println(dolphin);
        dolphin.swim();

        Penguin penguin = new Penguin("Penguin", "Harry Kane", 6, false, "Antarctic", 300);
        System.out.println(penguin);
        penguin.swim();
    }
}