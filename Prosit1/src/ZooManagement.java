import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        /*
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages);
        */

        Scanner scanner = new Scanner(System.in);

        int nbrCages;

        do {
            System.out.println("Donner le nombre de cages :");
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            nbrCages = scanner.nextInt();
        } while (nbrCages <= 0);

        String zooName;
        do {
            System.out.println("Donner le nom du zoo :");
            zooName = scanner.next();
        } while (zooName.isEmpty());

        System.out.println(zooName + " comporte " + nbrCages);

        scanner.close();
    }
}