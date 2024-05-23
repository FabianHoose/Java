public class Kreis extends Form {
    public double radius;

    public Kreis(double radius) {
        this.radius = radius;

    }

    @Override
    public float flaechenBerechnung() {
        return 0;
    }

    @Override
    public float display() {
        return (float) (radius * radius * Math.PI);
    }
}
