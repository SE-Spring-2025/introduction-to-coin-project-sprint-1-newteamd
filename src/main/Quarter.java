public class Quarter extends Coin {
    public Quarter() {
        this.familiarName = "Quarter";
	    this.metallurgyType = new CuproNickel();
        this.value = 0.25;
    }
    protected void addRidges(){
        super.addRidges();
        this.ridgedEdge = true;
    }
    protected void imprintImage(){
        super.imprintImage();
        this.frontImage = "G_Washington";
    }
    protected void  imprintBackImage(){
        super.imprintBackImage();
        this.backImage = "Eagle";
    }
    protected void imprintBackText(){
        super.imprintBackText();
        this.valueDescription = "QUARTER DOLLAR";
    }
    protected void increment(){
        super.increment();
        coinCounts.incrementQuarter();
    }
}
