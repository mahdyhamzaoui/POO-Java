public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    public final int nbrCages = 25;
    public int nbAnimals;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.nbAnimals = 0;
    }

    @Override
    public String toString() {
        return "Zoo : " + name + ", Ville : " + city + ", Nombre de cages : " + nbrCages;
    }

    /*
    public boolean addAnimal(Animal animal) {
        if (nbAnimals < nbrCages) {
            animals[nbAnimals] = animal;
            nbAnimals++;
            return true;
        } else {
            System.out.println("Le zoo est plein !");
            return false;
        }
    }
     */

    public void displayAnimals() {
        System.out.println("--- Animaux du Zoo ---");
        for (int i = 0; i < nbAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].name.equals(animal.name) &&
                    animals[i].family.equals(animal.family) &&
                    animals[i].age == animal.age &&
                    animals[i].isMammal == animal.isMammal) {
                System.out.println("L'animal se trouve dans la colonne " + i);
                return i;
            }
        }
        System.out.println("L'animal n'est pas trouvé !");
        return -1;
    }

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].name.equals(animal.name) &&
                    animals[i].family.equals(animal.family) &&
                    animals[i].age == animal.age &&
                    animals[i].isMammal == animal.isMammal) {
                System.out.println("Cet animal existe déjà !");
                return false;
            }
        }

        if (nbAnimals >= nbrCages) {
            System.out.println("Le zoo est plein !");
            return false;
        }

        animals[nbAnimals] = animal;
        nbAnimals++;
        System.out.println("Animal ajouté avec succès !");
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].equals(animal)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("L'animal n'est pas trouvé !");
            return false;
        }

        for (int i = index; i < nbAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbAnimals - 1] = null;
        nbAnimals--;
        System.out.println("L'animal est supprimé avec succès !");
        return true;
    }

    public boolean isZooFull(){
        return nbAnimals == nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbAnimals > z2.nbAnimals) {
            return z1;
        } else {
            return z2;
        }
    }
}