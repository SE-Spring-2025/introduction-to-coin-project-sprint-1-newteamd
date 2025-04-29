public class HalfDollar extends Coin {
    public HalfDollar() {
        this.familiarName = "HalfDollar";
	    this.metallurgyType = new CuproNickel();
        this.value = 0.50;
    }
    protected void addRidges(){
        super.addRidges();
        this.ridgedEdge = true;
    }
    protected void imprintImage(){
        super.imprintImage();
        this.frontImage = "J_Kennedy";
    }
    protected void  imprintBackImage(){
        super.imprintBackImage();
        this.backImage = "Presidential_Seal";
    }
    protected void imprintBackText(){
        super.imprintBackText();
        this.valueDescription = "HALF DOLLAR";
    }
    protected void increment(){
        super.increment();
        coinCounts.incrementHalfDollar();
    }
}
