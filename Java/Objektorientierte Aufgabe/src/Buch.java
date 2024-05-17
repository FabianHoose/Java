public class Buch {

    private String titel;
    private String autor;
    private int jahr;
    private boolean ausgeliehen;
    

// Der Konstruktor ist eine spezielle Methode zur erstellung eines Objektes.
    public Buch(String titel, String autor, int jahr) {
        this.titel = titel;
        this.autor = autor;
        this.jahr = jahr;
        this.ausgeliehen = ausgeliehen;

    }

    //Methoden

    public void ausleihen(){

        if (ausgeliehen){
            ausgeliehen = true;

            System.out.println("Das Buch " + titel + " wurde ausgeliehen!");

        } else{
            System.out.println("Das Buch "+ titel +" ist bereits ausgeliehen!");
        }

    }
    public void zurueckgeben(){

        if(ausgeliehen){
            ausgeliehen = false;
                    System.out.println("Das Buch "+ titel+ " wurde zurückgegeben!");

        } else{
            System.out.println("Das Buch "+ titel+  " war nicht ausgeliehen!");
        }
    }

    public boolean isAusgeliehen() {
        return ausgeliehen;

    }
    public String toString() {
        return "|BuchTitel= " +titel+ ", Autor= "+autor+ ", Jahr= "+jahr+", Ausgeliehen= "+ausgeliehen+"|";



    }

    public String getTitel(){return this.titel; }
}



