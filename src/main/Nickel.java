public class Nickel extends Coin {
    public Nickel() {
        this.familiarName = "Nickel";
	    this.metallurgyType = new CuproNickel();
        this.value = 0.05;
    }
    protected void addRidges(){
        super.addRidges();
        this.ridgedEdge = false;
    }
    protected void imprintImage(){
        super.imprintImage();
        this.frontImage = "T_Jefferson";
    }
    protected void  imprintBackImage(){
        super.imprintBackImage();
        this.backImage = "Jefferson_Memorial";
    }
    protected void imprintBackText(){
        super.imprintBackText();
        this.valueDescription = "FIVE CENTS";
    }
    protected void increment(){
        super.increment();
        coinCounts.incrementNickel();
    }
}
