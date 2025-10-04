public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String toString() {
        return "Nom de l'animal : " + name + ", Famille : " + family + ", Âge : " + age + " ans, Mammifère : " + isMammal;
    }


}