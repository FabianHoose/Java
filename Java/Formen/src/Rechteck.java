public class Rechteck extends Form {
    private double breite;
    private double hoehe;

    public Rechteck(double breite, double hoehe){
        this.breite = breite;
        this.hoehe = hoehe;

    }

    @Override
    public float flaechenBerechnung() {
        return 0;
    }

    @Override
    public float display() {
        return (float) (breite * hoehe);

    }
}