import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {

            Konto konto1 = new Konto(1234); // Ein neues Konto (Konto1) wird mit der Kontonummer 1234 erstellt.
            Konto konto2 = new Konto(5678);// Ein zweites Konto (Konto2) mit der Kontonummer 5678 erstellt zu Überwisen.

            konto1.einzahlen(6000.30); // 6000.30 Euro einzahlen auf das Konto1
            konto1.auszahlen(5000.00); //5000.00 Euro wurden ausgezahl vom Konto1

            konto1.ueberweisen(konto2, 50.0); // 50 Euro von Konto1 auf Konto2 überweisen

            Bank sparkasse = new Bank(); // Sparkasse wurde als Datentyp Bank definiert.
            sparkasse.hinzufuegen (konto1); // Konto1 wird der sparkasse hinzugefügt
            sparkasse.hinzufuegen (konto2); // Konto2 wird der sparkasse hinzugefügt


            System.out.println("Ihr aktuelles Guthaben auf Ihrem Konto beträgt: " + konto1.getKontostand() + "€"); // Der Kontostand wird abgefragt und auf die Konsole ausgegeben.
            System.out.println("Ihr aktuelles Guthaben auf Ihrem Konto beträgt: " + konto2.getKontostand() + "€"); // Der Kontostand wird abgefragt und auf die Konsole ausgegeben.
            sparkasse.alleKontenanzeigen(); // Die Liste der Konten werden in der Konsole angezeigt
        }

}