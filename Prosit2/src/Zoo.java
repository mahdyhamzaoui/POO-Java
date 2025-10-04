public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }

    public void displayZoo() {
        System.out.println("Nom du Zoo : " + this.name);
        System.out.println("Ville : " + this.city);
        System.out.println("Nombre de cages : " + this.nbrCages);
    }

    public String toString() {
        return "Nom du Zoo : " + name + ", Ville : " + city + ", Nombre de cages : " + nbrCages;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux du Zoo");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            }
        }
    }
}