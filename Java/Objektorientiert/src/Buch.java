public class Buch {

    private String titel;

    private String autor;

    private double preis;

    //Konstruktor

    public Buch(String titel, String autor, double preis) {

        this.titel = titel;

        this.autor = autor;

        this.preis = preis;

    }

    //Methode zum Anzeigen der Buchdetails

    public void anzeigen(){

        System.out.println("Titel: " + titel);
        System.out.println("Autor: " + autor);
        System.out.println("Preis: " + preis + "EUR");
    }
}
