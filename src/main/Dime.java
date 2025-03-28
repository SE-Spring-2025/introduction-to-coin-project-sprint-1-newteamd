public class Dime extends Coin {
    public Dime(int year) {
        super(year);
        familiarName = "Dime";
	    frontImage = "F_Roosevelt";
	    backImage = "Torch_Branches";
	    valueDescription = "ONE DIME";
	    ridgedEdge = true;
	    metallurgy = "Cupro-Nickel";
        value = 0.10;
    }
}
