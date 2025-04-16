public class Dollar extends Coin {
    public Dollar() 
    {
        super();
        this.familiarName = "Dollar";
        this.frontImage = "S_Anthony";
        this.backImage = "Moon_Eagle";
        this.valueDescription = "ONE DOLLAR";
        this.ridgedEdge = true;
        this.metallurgyType = new CuproNickel();
        this.value = 1.00;
        coinCounts.incrementDollar();
    }
    public Dollar(int year) {
        super(year);
        this.familiarName = "Dollar";
	    this.frontImage = "S_Anthony";
	    this.backImage = "Moon_Eagle";
	    this.valueDescription = "ONE DOLLAR";
	    this.ridgedEdge = true;
	    this.metallurgyType = new CuproNickel();
        this.value = 1.00;
        coinCounts.incrementDollar();
    }
}
