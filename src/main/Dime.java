public class Dime extends Coin {
    public Dime() 
    {
        super();
        this.familiarName = "Dime";
        this.frontImage = "F_Roosevelt";
        this.backImage = "Torch_Branches";
        this.valueDescription = "ONE DIME";
        this.ridgedEdge = true;
        this.metallurgyType = new CuproNickel();
        this.value = 0.10;
    }   
    public Dime(int year) {
        super(year);
        this.familiarName = "Dime";
	    this.frontImage = "F_Roosevelt";
	    this.backImage = "Torch_Branches";
	    this.valueDescription = "ONE DIME";
	    this.ridgedEdge = true;
	    this.metallurgyType = new CuproNickel();
        this.value = 0.10;
    }
}
