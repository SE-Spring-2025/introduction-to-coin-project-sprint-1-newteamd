public class Quarter extends Coin {
    public Quarter(int year) {
        super(year);
        familiarName = "Quarter";
	    frontImage = "G_Washington";
	    backImage = "Eagle";
	    valueDescription = "QUARTER DOLLAR";
	    ridgedEdge = true;
	    metallurgy = "Cupro-Nickel";
        value = 0.25;
    }
}
