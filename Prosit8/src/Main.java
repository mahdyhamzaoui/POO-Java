import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ben Ali", "Ahmed", "RH", 2);
        Employe e2 = new Employe(1, "Trabelsi", "Sami", "IT", 1);
        Employe e3 = new Employe(4, "Bouzid", "Amina", "Finance", 3);
        Employe e4 = new Employe(2, "Hammami", "Leila", "IT", 2);
        Employe e5 = new Employe(5, "Fathi", "Nour", "Finance", 2);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);

        System.out.println("=== Liste initiale ===");
        societe.displayEmploye();

        System.out.println("\n=== Tri par ID (naturel) ===");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n=== Tri par Département, Grade et Nom ===");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n=== Recherche par nom 'Bouzid' ===");
        System.out.println(societe.rechercherEmploye("Bouzid") ? "Trouvé" : "Non trouvé");

        System.out.println("\n=== Recherche par département 'IT' ===");
        List<Employe> listIT = societe.rechercherParDepartement("IT");
        for (Employe e : listIT) {
            System.out.println(e);
        }
    }
}