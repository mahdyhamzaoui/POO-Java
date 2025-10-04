package entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbAnimals;

    public Zoo(String name, String city) {
        setName(name);
        setCity(city);
        this.animals = new Animal[nbrCages];
        this.nbAnimals = 0;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            System.out.println("Le nom du zoo ne doit pas être vide.");
        this.name = name;
    }

    public void setCity(String city) { this.city = city; }

    @Override
    public String toString() {
        return "Zoo : " + name + ", Ville : " + city +
                ", Nombre de cages : " + nbrCages +
                ", Animaux présents : " + nbAnimals;
    }

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("Cet animal existe déjà !");
                return false;
            }
        }
        if (isZooFull()) {
            System.out.println("Le zoo est plein !");
            return false;
        }
        animals[nbAnimals++] = animal;
        System.out.println("Animal ajouté avec succès !");
        return true;
    }

    public void displayAnimals() {
        System.out.println("--- Animaux du Zoo ---");
        for (int i = 0; i < nbAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].getFamily().equals(animal.getFamily()) &&  animals[i].getName().equals(animal.getName()) && animals[i].getAge()==animal.getAge() && animals[i].isMammal() == animal.isMammal()) {
                System.out.println("L'animal se trouve dans la colonne " + i);
                return i;
            }
        }
        System.out.println("L'animal n'est pas trouvé !");
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false;
        for (int i = index; i < nbAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--nbAnimals] = null;
        System.out.println("L'animal est supprimé avec succès !");
        return true;
    }

    public boolean isZooFull() {
        return nbAnimals == nbrCages;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.nbAnimals > z2.nbAnimals) ? z1 : z2;
    }
}