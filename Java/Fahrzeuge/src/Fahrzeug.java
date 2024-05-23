public class Fahrzeug {
    protected double maxGeschwindigkeit;
    protected String marke;
    protected String farbe;

    public Fahrzeug(double maxGeschwindigkeit, String marke, String farbe) {
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.marke = marke;
        this.farbe = farbe;

    }

    public void fahren(){
        System.out.println("Starte das Fahrzeug "+ getMarke());
    }

protected  String getMarke(){return marke;}

}
