
public class Main {
    public static void main(String[] args) {

        Bibliothek bibliothek = new Bibliothek();

        // Erstellung der Bücher

        Buch buch1 = new Buch("Der Name des Windes", "Patrick Rothfuss", 2012);
        Buch buch2 = new Buch("Die Chronik des Eisernen Druiden 1", "Kevin Hearne", 2013 );

     //   Erstellung von Mitgliedern

        Mitglied mitglied1 = new Mitglied("Fabian",10001);
        Mitglied mitglied2 = new Mitglied("Kevin", 10002);
        Mitglied mitglied3 = new Mitglied("Jan", 10003);

        //Die Bücher den Bibliotheken hinzufügen

        bibliothek.buchHinzfuegen(buch1);
        bibliothek.buchHinzfuegen(buch2);

        // Die Mitglieder der Bibliothek hinzufügen

        bibliothek.mitgliederHinzufuegen(mitglied1);
        bibliothek.mitgliederHinzufuegen(mitglied2);
        bibliothek.mitgliederHinzufuegen(mitglied3);

        mitglied1.buchAusleihen(buch1);
        mitglied2.buchAusleihen(buch1);
        System.out.println("\nDer aktuelle Stand der Bibliothek nach dem ausleihen " +bibliothek);
        mitglied1.buchZurueckgeben(buch1);
        mitglied2.buchAusleihen(buch1);
        mitglied3.buchAusleihen(buch2);

        System.out.println("\nDie aktuelle Bibliothek nach dem ausleihen "+ bibliothek);

    }
}