package main;

import entities.Animal;
import entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Stade des Animaux", "Tunis");

        myZoo.addAnimal(new Animal("lion","Lionel Messi",-1, true));
        myZoo.addAnimal(new Animal("loup","Cristiano Ronaldo",2, false));
        myZoo.addAnimal(new Animal("tigre","Robert Lewandowski",3, true));
        myZoo.addAnimal(new Animal("girafe","Zlatan Ibrahimovic",4, true));
        myZoo.addAnimal(new Animal("tortue","Kylian Mbappé",5, false));

        myZoo.displayAnimals();

        Animal animal1 = new Animal("girafe","Zlatan Ibrahimovic",4,true);

        myZoo.searchAnimal(animal1);

        Animal animal2 = new Animal("girafe","Zlatan Ibrahimovic",4,true);

        myZoo.searchAnimal(animal2);
    }
}