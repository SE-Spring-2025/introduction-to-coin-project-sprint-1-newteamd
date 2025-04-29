public class Penny extends Coin {
    public Penny() {
        this.familiarName = "Penny";
	    this.metallurgyType = new Copper();
        this.value = 0.01;
    }
    protected void addRidges(){
        super.addRidges();
        this.ridgedEdge = false;
    }
    protected void imprintImage(){
        super.imprintImage();
        this.frontImage = "A_Lincoln";
    }
    protected void  imprintBackImage(){
        super.imprintBackImage();
        this.backImage = "Lincoln_Memorial";
    }
    protected void imprintBackText(){
        super.imprintBackText();
        this.valueDescription = "ONE CENT";
    }
    protected void increment(){
        super.increment();
        coinCounts.incrementPenny();
    }
}
