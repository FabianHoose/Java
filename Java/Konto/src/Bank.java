//Importiert die Bibliothek Listen
import java.util.List;
//Importiert die Bibliothek Arraylist
import java.util.ArrayList;


public class Bank { //Definiert die Listenkonten als Liste im Datentyp Konto
    public List <Konto> Listenkonten;


    public Bank (){ // Erstellt eine neue Arraylist als Listenkonten
        Listenkonten = new ArrayList<>();
    }

    public void hinzufuegen(Konto konto) { // Methode zum hinzufügen von Konten in die Listenkonten
        Listenkonten.add (konto);}

    public void loeschen(Konto konto) { // Methode zum löschen von Konten von den Listenkonten
        Listenkonten.remove (konto);}

    public void alleKontenanzeigen() { // Methode zur Ausgabe der Kontonummer sowie des Kontostandes jedes Kontos
        for (Konto konto : Listenkonten) {
            System.out.println("Kontonummer:" + konto.getKontonummer() +" | Kontostand: " + konto.getKontostand() + "€"); //
        }
    }
}


