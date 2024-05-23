import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wähle eine Form aus die du berechnen möchtest: ");
        System.out.println("1. Kreis");
        System.out.println("2. Rechteck");
        System.out.println("3. Dreieck");
        int wahl = scanner.nextInt();

        switch (wahl) {
            case 1:
                System.out.println("Gib den Radius des Kreises ein: ");
                double radius = scanner.nextInt();
                Kreis kreis = new Kreis(radius);
                System.out.println("Die Fläche des Kreises beträgt: " + kreis.display());
                break;

            case 2:
                System.out.print("Gib die Breite des Rechtecks ein: ");
                double breite = scanner.nextDouble();
                System.out.print("Gib die Höhe des Rechtecks ein: ");
                double hoehe = scanner.nextDouble();
                Rechteck rechteck = new Rechteck(breite, hoehe);
                System.out.println("Die Fläche des Rechtecks beträgt: " + rechteck.display());
                break;
            case 3:
                System.out.print("Gib die Basis des Dreiecks ein: ");
                double basis = scanner.nextDouble();
                System.out.print("Gib die Höhe des Dreiecks ein: ");
                double dreieckHoehe = scanner.nextDouble();
                Dreieck dreieck = new Dreieck(basis, dreieckHoehe);
                System.out.println("Die Fläche des Dreiecks beträgt: " + dreieck.display());
                break;
            default:
                System.out.println("Ungültige Wahl!");
                break;
        }

        scanner.close();
    }
}
