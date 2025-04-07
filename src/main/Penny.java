public class Penny extends Coin {
    public Penny() 
    {
        super();
        this.familiarName = "Penny";
        this.frontImage = "A_Lincoln";
        this.backImage = "Lincoln_Memorial";
        this.valueDescription = "ONE CENT";
        this.ridgedEdge = false;
        this.metallurgyType = new Copper();
        this.value = 0.01;
    }
    public Penny(int year) {
        super(year);
        this.familiarName = "Penny";
	    this.frontImage = "A_Lincoln";
	    this.backImage = "Lincoln_Memorial";
	    this.valueDescription = "ONE CENT";
        this.ridgedEdge = false;
	    this.metallurgyType = new Copper();
        this.value = 0.01;
    }
}
