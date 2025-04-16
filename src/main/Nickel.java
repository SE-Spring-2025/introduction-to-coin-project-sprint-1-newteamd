public class Nickel extends Coin {
    public Nickel() 
    {
        super();
        this.familiarName = "Nickel";
        this.frontImage = "T_Jefferson";
        this.backImage = "Jefferson_Memorial";
        this.valueDescription = "FIVE CENTS";
        this.ridgedEdge = false;
        this.metallurgyType = new CuproNickel();
        this.value = 0.05;
        coinCounts.incrementNickel();
    }   
    public Nickel(int year) {
        super(year);
        this.familiarName = "Nickel";
	    this.frontImage = "T_Jefferson";
	    this.backImage = "Jefferson_Memorial";
	    this.valueDescription = "FIVE CENTS";
	    this.ridgedEdge = false;
	    this.metallurgyType = new CuproNickel();
        this.value = 0.05;
        coinCounts.incrementNickel();
    }
}
