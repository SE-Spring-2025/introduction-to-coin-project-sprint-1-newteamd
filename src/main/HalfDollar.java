public class HalfDollar extends Coin {
    public HalfDollar() 
    {
        super();
        this.familiarName = "HalfDollar";
        this.frontImage = "J_Kennedy";
        this.backImage = "Presidential_Seal";
        this.valueDescription = "HALF DOLLAR";
        this.ridgedEdge = true;
        this.metallurgyType = new CuproNickel();
        this.value = 0.50;
        coinCounts.incrementHalfDollar();
    }
    public HalfDollar(int year) {
        super(year);
        this.familiarName = "HalfDollar";
	    this.frontImage = "J_Kennedy";
	    this.backImage = "Presidential_Seal";
	    this.valueDescription = "HALF DOLLAR";
	    this.ridgedEdge = true;
	    this.metallurgyType = new CuproNickel();
        this.value = 0.50;
        coinCounts.incrementHalfDollar();
    }
}
