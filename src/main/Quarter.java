public class Quarter extends Coin {
    public Quarter(int year) {
        super(year);
        this.familiarName = "Quarter";
	    this.frontImage = "G_Washington";
	    this.backImage = "Eagle";
	    this.valueDescription = "QUARTER DOLLAR";
	    this.ridgedEdge = true;
	    this.metallurgy = "Cupro-Nickel";
        this.value = 0.25;
    }
}
