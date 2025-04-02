public class HalfDollar extends Coin {
    public HalfDollar() 
    {
        super();
        this.familiarName = "HalfDollar";
        this.frontImage = "J_Kennedy";
        this.backImage = "Presidential_Seal";
        this.valueDescription = "HALF DOLLAR";
        this.ridgedEdge = true;
        this.metallurgy = "Cupro-Nickel";
        this.value = 0.50;
    }
    public HalfDollar(int year) {
        super(year);
        this.familiarName = "HalfDollar";
	    this.frontImage = "J_Kennedy";
	    this.backImage = "Presidential_Seal";
	    this.valueDescription = "HALF DOLLAR";
	    this.ridgedEdge = true;
	    this.metallurgy = "Cupro-Nickel";
        this.value = 0.50;
    }
}
