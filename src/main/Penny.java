public class Penny extends Coin {
    public Penny(int year) {
        super(year);
        familiarName = "Penny";
	    frontImage = "A_Lincoln";
	    backImage = "Lincoln_Memorial";
	    valueDescription = "ONE CENT";
	    ridgedEdge = false;
	    metallurgy = "Copper";
        value = 0.01;
    }
}
