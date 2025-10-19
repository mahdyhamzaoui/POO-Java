package entities;

public class Zoo {
    private final Animal[] animals;
    private String name;
    private String city;
    private final int NBR_CAGES = 25;
    private int nbAnimals;

    private final int NBR_AQUATIC_CAGES = 10;
    private int nbrAquatic = 0;
    private Aquatic[] aquaticsAnimals;

    public Zoo(String name, String city) {
        setName(name);
        setCity(city);
        this.animals = new Animal[NBR_CAGES];
        this.nbAnimals = 0;
        this.aquaticsAnimals = new Aquatic[NBR_AQUATIC_CAGES];
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            System.out.println("Le nom du zoo ne doit pas être vide !");
        this.name = name;
    }

    public void setCity(String city) { this.city = city; }

    @Override
    public String toString() {
        return "Zoo : " + name + ", Ville : " + city +
                ", Nombre de cages : " + NBR_CAGES +
                ", Animaux présents : " + nbAnimals +
                ", Animaux aquatiques : " + nbrAquatic;
    }

    public void addAnimal(Animal animal) {
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("Cet animal existe déjà !");
                return;
            }
        }
        if (isZooFull()) {
            System.out.println("Le zoo est plein !");
            return;
        }
        animals[nbAnimals++] = animal;
        System.out.println("Animal ajouté avec succès !");
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
                System.out.println("L'animal se trouve dans la cage " + i);
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
        return nbAnimals == NBR_CAGES;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.nbAnimals > z2.nbAnimals) ? z1 : z2;
    }

    public Aquatic[] getAquaticsAnimals() {
        return aquaticsAnimals;
    }

    public void setAquaticsAnimals(Aquatic[] aquaticsAnimals) {
        this.aquaticsAnimals = aquaticsAnimals;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquatic < NBR_AQUATIC_CAGES) {
            aquaticsAnimals[nbrAquatic] = aquatic;
            this.nbrAquatic++;
            System.out.println("Animal aquatique ajouté avec succès !");
        } else {
            System.out.println("Le bassin des animaux aquatiques est plein !");
        }
    }

    public void displayAquaticAnimals() {
        System.out.println("--- Animaux Aquatiques du Zoo ---");
        for (int i = 0; i < nbrAquatic; i++) {
            System.out.println(aquaticsAnimals[i]);
        }
    }

    public float maxPenguinDepthSwimming() {
        float max = 0;

        for (int i = 0; i < nbrAquatic; i++) {
            Aquatic currentAnimal = aquaticsAnimals[i];

            if (currentAnimal instanceof Penguin) {
                Penguin penguin = (Penguin) currentAnimal;

                if (penguin.getSwimmingDepth() > max) {
                    max = penguin.getSwimmingDepth();
                }
            }
        }

        return max;
    }

    public void displayNumberOfAquaticsByType(){
        int nbPenguins = 0;
        int nbDolphins = 0;
        for (int i = 0; i < nbrAquatic; i++) {
            Aquatic currentAnimal = aquaticsAnimals[i];
            if(currentAnimal instanceof Penguin){
                nbPenguins++;
            }
            else if(currentAnimal instanceof Dolphin){
                nbDolphins++;
            }
        }
        System.out.println("Le nombre de penguins est : " + nbPenguins);
        System.out.println("Le nombre de dolphins est : " + nbDolphins);
    }
}