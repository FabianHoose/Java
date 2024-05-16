public class Konto {
    // Eigenschaft Kontonummer, langer Ganzzahlentyp
    private long kontonummer;
    // Eigenschaft Kontostand, großer Fließkomma Datentyp
    private double kontostand;

    public Konto(long kontonummer) {
        this.kontonummer = kontonummer; // Hier wird die Kontonummer definiert
        this.kontostand = 0.0; // Jedes Konto wird mit einem Kontostand von 0.0 definiert
    }

    public void einzahlen(double betrag) { // Methode zum einzahlen auf ein Konto
        this.kontostand += betrag;

    }

    public void auszahlen(double betrag) { // Methode zum auszahlen von einem Konto
        if (betrag > this.kontostand) {
            System.out.println("Sie haben nicht genug Guthaben auf Ihrem Konto. Wenden Sie sich an einen Mitarbeiter oder geh arbeiten du Schmarotzer!");
            //  Wenn-Funktion die sagt das der Betrag größer sein muss als das Konto, sonst wird folgende Fehlermeldung angezeigt.
        } else {
            this.kontostand -= betrag;
            System.out.println("Die Auzzahlung war Erfolgreich: " + betrag + " Euro von Ihrem Konto wurden abgezogen");
        }

    }

    public void ueberweisen(Konto zielkonto, double betrag) { //Methode zum überweisen von einem Konto zum anderen.
        if (betrag > this.kontostand) {
            System.out.println("Sie haben nicht genug Guthaben auf Ihrem Konto für die Überweisung.");
            // Wenn-Funktion die besagt das der Betrag zum Überweisen grßer sein muss als das der Konstostand, sonst wird folgenden Fehlermeldung angezeigt.
        } else {
            this.kontostand -= betrag;
            zielkonto.einzahlen(betrag);
            System.out.println("Überweisung erfolgreich: " + betrag + " Euro, wurden an das Zielkonto überwisen! ");
        }
        ;
    }


    public double getKontostand() { // Methode zum Abfragen des Kontostandes
        return this.kontostand;

    }

    public int getKontonummer() { // Methode zum Abfragen der Kontonummer
        return (int) this.kontonummer;
    }
}