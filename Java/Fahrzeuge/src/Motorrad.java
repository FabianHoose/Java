public class Motorrad extends Fahrzeug{
    protected int anzahlReifen;
    protected boolean beiWagen;

    public Motorrad(double maxGeschwindigkeit, String marke, String farbe,int anzahlReifen, boolean beiWagen){
        super(maxGeschwindigkeit, marke, farbe);
        this.anzahlReifen = anzahlReifen;
        this.beiWagen = beiWagen;

    }
    @Override
    public void fahren() {
        System.out.println("Starte das Motorrad " + getMarke());
    }
    protected String getInfo() {
        String info = maxGeschwindigkeit + ", " + marke + ", " + farbe + ", " + anzahlReifen + ", " + beiWagen;
        return info;
    }





}



