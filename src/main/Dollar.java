public class Dollar extends Coin {
    public Dollar() {
        this.familiarName = "Dollar";
	    this.metallurgyType = new CuproNickel();
        this.value = 1.00;
    }
    protected void addRidges(){
        super.addRidges();
        this.ridgedEdge = false;
    }
    protected void imprintImage(){
        super.imprintImage();
        this.frontImage = "S_Anthony";
    }
    protected void  imprintBackImage(){
        super.imprintBackImage();
        this.backImage = "Moon_Eagle";
    }
    protected void imprintBackText(){
        super.imprintBackText();
        this.valueDescription = "ONE DOLLAR";
    }
    protected void increment(){
        super.increment();
        coinCounts.incrementDollar();
    }
}
