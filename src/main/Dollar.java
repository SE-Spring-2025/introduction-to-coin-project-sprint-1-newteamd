public class Dollar extends Coin {
    public Dollar() 
    {
        super();
        this.familiarName = "Dollar";
        this.frontImage = "S_Anthony";
        this.backImage = "Moon_Eagle";
        this.valueDescription = "ONE DOLLAR";
        this.ridgedEdge = true;
        this.metallurgy = "Cupro-Nickel";
        this.value = 1.00;
    }
    public Dollar(int year) {
        super(year);
        this.familiarName = "Dollar";
	    this.frontImage = "S_Anthony";
	    this.backImage = "Moon_Eagle";
	    this.valueDescription = "ONE DOLLAR";
	    this.ridgedEdge = true;
	    this.metallurgy = "Cupro-Nickel";
        this.value = 1.00;
    }
}
