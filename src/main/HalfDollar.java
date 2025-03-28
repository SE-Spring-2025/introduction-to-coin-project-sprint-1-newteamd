public class HalfDollar extends Coin {
    public HalfDollar(int year) {
        super(year);
        familiarName = "HalfDollar";
	    frontImage = "J_Kennedy";
	    backImage = "Presidential_Seal";
	    valueDescription = "HALF DOLLAR";
	    ridgedEdge = true;
	    metallurgy = "Cupro-Nickel";
        value = 0.50;
    }
}
