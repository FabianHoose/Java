public class Auto extends Fahrzeug {
    protected int anzahlReifen;


    public Auto(double maxGeschwindigkeit, String marke, String farbe, int anzahlReifen) {
        super(maxGeschwindigkeit, marke, farbe);
        this.anzahlReifen = anzahlReifen;
        }

    @Override
    public void fahren() {
        System.out.println("Starte das Auto " + getMarke());
    }

}







