import java.util.List;
import java.util.ArrayList;


public class Bibliothek {

    public List <Buch> buecher;
    public List <Mitglied> mitglieder;

// Der Konstruktor ist eine spezielle Methode zur erstellung eines Objektes.
    public Bibliothek() {
        buecher = new ArrayList<>();
        mitglieder = new ArrayList<>();

    }
// Methoden
    public void buchHinzfuegen (Buch buch){
    buecher.add(buch);
    System.out.println("Das Buch "+  buch.getTitel()+ " wurde der Bibliothek hinzugefügt!");
    }

    public void mitgliederHinzufuegen(Mitglied mitglied){
        mitglieder.add(mitglied);
        System.out.println("Die Person "+ mitglied.getName()+ " wurde zur Bibliothek hinzugefügt");

    }

    public String toString(){
        return "Bibliothek |Bücher=" +buecher+ ", Mitglieder= "+ mitglieder + "|";

    }
}
