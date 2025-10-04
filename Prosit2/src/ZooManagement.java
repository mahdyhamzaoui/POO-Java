//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ZooManagement {
    public static void main(String[] args) {
    /*
        Animal lion = new Animal();

        lion.family = "leo";
        lion.name = "Lionel Messi";
        lion.age = 18;
        lion.isMammal = false;

        Zoo myZoo = new Zoo();

        myZoo.name = "Stade des Animaux";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 25;

        myZoo.animals = new Animal[25];

        myZoo.animals[0] = lion;

        System.out.println("Nom du Zoo : " + myZoo.name);
        System.out.println("Ville du Zoo : " + myZoo.city);
        System.out.println("Nom de l'animal : " + myZoo.animals[0].name);
        System.out.println("Âge de l'animal : " + myZoo.animals[0].age);
    }
    */

        Animal lion = new Animal("Leo", "Lionel Messi", 18, false);
        Zoo myZoo = new Zoo("Stade des Animaux", "Tunis", 25);

        myZoo.animals[0] = lion;
        System.out.println("Animal 1: " + myZoo.animals[0].name + " (Famille: " + myZoo.animals[0].family + ")");

        // On remarque que 20 lignes sont remplacées par seulement 4 lignes

        Animal tiger = new Animal("tigre", "Zlatan Ibrahimovic", 15, true);
        Animal eagle = new Animal("aigle", "Kylian Mbappé", 2, false);
        Animal panda = new Animal("panda", "Gigi Buffon", 22, true);

        myZoo.animals[1] = tiger;
        myZoo.animals[2] = eagle;
        myZoo.animals[3] = panda;

        System.out.println("Animal 2: " + myZoo.animals[1].name + " (Famille: " + myZoo.animals[1].family + ")");
        System.out.println("Animal 3: " + myZoo.animals[2].name + " (Famille: " + myZoo.animals[2].family + ")");
        System.out.println("Animal 4: " + myZoo.animals[3].name + " (Famille: " + myZoo.animals[3].family + ")");

        myZoo.displayZoo();

        /*
        On remarque que System.out.println(myZoo) sur l'objet myZoo affiche Zoo@2d98a335
        Zoo est le nom de la classe de l'objet et le symbole @ sépare le nom de la classe du reste de l'information
        7852e922 est le hachcode de l'objet
        */

        System.out.println(myZoo);
        myZoo.displayAnimals(); // displayAnimals() est une méthode dans la classe Zoo qui affiche la liste de tous les animaux en utilsant la méthode toString()
    }
}