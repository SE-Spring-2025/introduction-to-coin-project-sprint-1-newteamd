public class Nickel extends Coin {
    public Nickel(int year) {
        super(year);
        this.familiarName = "Nickel";
	    this.frontImage = "T_Jefferson";
	    this.backImage = "Jefferson_Memorial";
	    this.valueDescription = "FIVE CENTS";
	    this.ridgedEdge = false;
	    this.metallurgy = "Cupro-Nickel";
        this.value = 0.05;
    }
}
