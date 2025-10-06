package entities;

public class Terrestrial extends Animal{
    protected int nbrLegs;

    public Terrestrial(){
        super();
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial [Family=" + getFamily() +
                ", Name=" + getName() +
                ", Age=" + getAge() +
                ", isMammal=" + getMammal() +
                ", NbrLegs=" + nbrLegs +
                "]";
    }
}
