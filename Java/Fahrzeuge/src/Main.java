public class Main {
    public static void main(String[] args) {
       Auto auto1 = new Auto(200,"Mercedes Benz","Weiß",4);
       Auto auto2 = new Auto(313, "BMW","Türkis",4 );
       Motorrad motorrad1 = new Motorrad(250, "Suzuki","Lila", 2, false);
       Motorrad motorrad2 = new Motorrad(280, "Kawasaki","Schwarz", 2, true);

       auto1.fahren();
       auto2.fahren();
       motorrad1.fahren();
       motorrad2.fahren();

       System.out.println("Der " + auto1.marke+ " hat eine maximale Geschwindigikeit von " + auto1.maxGeschwindigkeit);
       System.out.println("Der " + auto2.marke+ " hat eine maximale Geschwindigikeit von " + auto2.maxGeschwindigkeit);
       System.out.println("Der " + motorrad1.marke+ " hat eine maximale Geschwindigikeit von " + motorrad1.maxGeschwindigkeit);
       System.out.println("Der " + motorrad2.marke+ " hat eine maximale Geschwindigikeit von " + motorrad2.maxGeschwindigkeit);
       System.out.println(motorrad2.getInfo());
    }
}