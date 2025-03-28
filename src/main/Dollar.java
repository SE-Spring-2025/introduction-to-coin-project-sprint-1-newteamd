public class Dollar extends Coin {
    public Dollar(int year) {
        super(year);
        familiarName = "Dollar";
	    frontImage = "S_Anthony";
	    backImage = "Moon_Eagle";
	    valueDescription = "ONE DOLLAR";
	    ridgedEdge = true;
	    metallurgy = "Cupro-Nickel";
        value = 1.00;
    }
}
