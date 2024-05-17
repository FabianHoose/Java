
public class Main {
    public static void main(String[] args) {
        Buch buch1 = new Buch("Der kleine Prinz","Antoine de Sain-Exupéry", 9.99);
        Buch buch2 = new Buch("1984","George Orwell",12.99);
        //Anzeigen der Buchdetails

        buch1.anzeigen();
        System.out.println();
        buch2.anzeigen();

        ;

    }
}