public class Kugelschreiber extends Stift{
    private double fuellstandMine;
    public Kugelschreiber(String schreibfarbe){
        super(schreibfarbe);
    }
    @Override
    public boolean istNutzbar() {
        return super.istNutzbar() && fuellstandMine > 0;
    }
    @Override
    public void gibSchreibfarbeAus() {
        System.out.println("die Farbe dieses Kugelschreibers ist: " + schreibfarbe);
    }
}
