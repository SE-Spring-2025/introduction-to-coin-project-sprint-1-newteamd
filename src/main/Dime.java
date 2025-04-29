public class Dime extends Coin {
    public Dime() {
        this.familiarName = "Dime";
	    this.metallurgyType = new CuproNickel();
        this.value = 0.10;
    }
    protected void addRidges(){
        super.addRidges();
        this.ridgedEdge = true;
    }
    protected void imprintImage(){
        super.imprintImage();
        this.frontImage = "F_Roosevelt";
    }
    protected void  imprintBackImage(){
        super.imprintBackImage();
        this.backImage = "Torch_Branches";
    }
    protected void imprintBackText(){
        super.imprintBackText();
        this.valueDescription = "ONE DIME";
    }
    protected void increment(){
        super.increment();
        coinCounts.incrementDime();
    }
}
