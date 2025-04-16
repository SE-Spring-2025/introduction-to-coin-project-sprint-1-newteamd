public class Quarter extends Coin {
    public Quarter() 
    {
        super();
        this.familiarName = "Quarter";
        this.frontImage = "G_Washington";
        this.backImage = "Eagle";
        this.valueDescription = "QUARTER DOLLAR";
        this.ridgedEdge = true;
        this.metallurgyType = new CuproNickel();
        this.value = 0.25;
        coinCounts.incrementQuarter();
    }
    public Quarter(int year) {
        super(year);
        this.familiarName = "Quarter";
	    this.frontImage = "G_Washington";
	    this.backImage = "Eagle";
	    this.valueDescription = "QUARTER DOLLAR";
	    this.ridgedEdge = true;
	    this.metallurgyType = new CuproNickel();
        this.value = 0.25;
        coinCounts.incrementQuarter();
    }
}
