import java.util.ArrayList;
import java.util.List;


public class Mitglied {

    private String name;
    private int mitgliedsnummer;
    public ArrayList<Buch> ausgelieheneBuecher;

// Der Konstruktor ist eine spezielle Methode zur erstellung eines Objektes.
    public Mitglied(String name, int mitgliedernummer){
        this.ausgelieheneBuecher = new ArrayList<>();
        this.name = name;
        this.mitgliedsnummer = mitgliedsnummer;
    }



    public void buchAusleihen(Buch buch) {
        if (buch.isAusgeliehen()) {
        buch.ausleihen();
        ausgelieheneBuecher.add(buch);
    } else

    {
        System.out.println(buch.getTitel() + " ist bereits ausgeliehen!");

    }  }
    public void buchZurueckgeben (Buch buch){

        if (ausgelieheneBuecher.contains(buch)) {
            buch.zurueckgeben();
            ausgelieheneBuecher.remove(buch);
        }else {
            System.out.println(name+ " hat das Buch " +buch.getTitel()+ " nicht ausgeliehen!");
        }


    }

    public String toString(){
        return "Mitglied |Name= "+ name +", Mitgliedernummer= "+ mitgliedsnummer+"|";

    }
    public String getName(){return this.name; }

}
