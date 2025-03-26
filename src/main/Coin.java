public class Coin {
    public static final double PENNY = 0.01;
    public static final double NICKEL = 0.05;
    public static final double DIME = 0.10;
    public static final double QUARTER = 0.25;
    public static final double HALFDOLLAR = 0.50;
    public static final double DOLLAR = 1.00;

    private double value;
    private String commonName;
    private String frontMotto;
    private int manufactureYear;
    private String frontImage;
    private String backImage;
    private String backMotto;
    private String frontLabel;
    private String backLabel;
    private String valueDescription;
    private boolean ridgedEdge;
    private String metallurgy;
    
    public Coin(){
        this(0);
    }
    public Coin(double value){

    }
    public Coin(double value, int year){

    }
    public String toString(){
        return "";
    }

    public double getValue() {
        return value;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getFrontMotto() {
        return frontMotto;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getFrontImage() {
        return frontImage;
    }

    public String getBackImage() {
        return backImage;
    }

    public String getbackMotto() {
        return backMotto;
    }

    public String GetfrontLabel() {
        return frontLabel;
    }

    public String getBackLabel() {
        return backLabel;
    }

    public String getValueDescription() {
        return valueDescription;
    }

    public boolean getRidgedEdge() {
        return ridgedEdge;
    }

    public String getMetallurgy() {
        return metallurgy;
    }



    
}
