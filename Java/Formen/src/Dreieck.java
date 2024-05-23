public class Dreieck extends Form {
    private double basis;
    private double hoehe;

    public Dreieck(double basis, double hoehe) {
        this.basis = basis;
        this.hoehe = hoehe;
    }


    @Override
    public float flaechenBerechnung() {
        return 0;
    }

    @Override
    public float display() {
        return (float) (0.5 * basis * hoehe);
    }
}