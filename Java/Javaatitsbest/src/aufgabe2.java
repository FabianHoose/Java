import java.util.Scanner;
public class aufgabe2 {
    public static void main (String[] args) {
        Scanner bmiliste = new Scanner(System.in);
        System.out.print("Bitte dein Gewicht in Kilogramm eintragen!: ");
        double gewicht = bmiliste.nextDouble();
        System.out.print("Bitte deine Größe in Meter eintragen!: ");
        double groesse = bmiliste.nextDouble();
        double BMI = gewicht / (groesse * groesse);
        System.out.print("Der Body Mass Index (BMI) ist " + BMI + " kg/m2");
}
}
