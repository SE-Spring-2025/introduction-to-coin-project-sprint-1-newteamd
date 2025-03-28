public class Nickel extends Coin {
    public Nickel(int year) {
        super(year);
        familiarName = "Nickel";
	    frontImage = "T_Jefferson";
	    backImage = "Jefferson_Memorial";
	    valueDescription = "FIVE CENTS";
	    ridgedEdge = false;
	    metallurgy = "Cupro-Nickel";
        value = 0.05;
    }
}
