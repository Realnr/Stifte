public class Buntstift extends Stift{
    private double restLaenge;
    public Buntstift(String schreibfarbe){
        super(schreibfarbe);
    }

    @Override
    public boolean istNutzbar() {
        return super.istNutzbar() && restLaenge>10;
    }

    @Override
    public void gibSchreibfarbeAus() {
        System.out.println("die Farbe dieses Buntstift ist: " + schreibfarbe);
    }
}
