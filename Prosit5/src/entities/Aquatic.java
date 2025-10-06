package entities;

public class Aquatic extends Animal{
    protected String habitat;

    public Aquatic(){
        super();
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic [Family=" + getFamily() +
                ", Name=" + getName() +
                ", Age=" + getAge() +
                ", isMammal=" + getMammal() +
                ", Habitat=" + habitat +
                "]";
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
