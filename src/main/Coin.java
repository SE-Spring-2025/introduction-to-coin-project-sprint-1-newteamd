import java.util.Calendar;
import java.text.DecimalFormat;

public abstract class Coin {
    private String familiarName;
    private double value;
    private String frontMotto;
    private String backMotto;
    private String frontLabel;
    private String backLabel;
    private String frontImage;
    private String backImage;
    private String valueDescription;
    private boolean ridgedEdge;
    private String metallurgy;
    private int manufactureYear;
    
    public Coin() {
	this((Calendar.getInstance()).get(Calendar.YEAR));
    }
	public Coin(int year){
		manufactureYear = year
		frontMotto = "IN GOD WE TRUST";
		backMotto = "E PLURIBUS UNUM";
		frontLabel = "LIBERTY";
		backLabel = "UNITED STATES OF AMERICA";
	}
	
    public String getFamiliarName() {
	return familiarName;
    }
    public double getValue() {
	return value;
    }
    public String getFrontMotto() {
	return frontMotto;
    }
    public String getBackMotto() {
	return backMotto;
    }
    public String getFrontLabel() {
	return frontLabel;
    }
    public String getBackLabel() {
	return backLabel;
    }
    public String getFrontImage() {
	return frontImage;
    }
    public String getBackImage() {
	return backImage;
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
    public int getYear() {
	return manufactureYear;
    }

    public String toString() {
	DecimalFormat df = new DecimalFormat("0.00");
        String formattedValue = df.format(value);
	
	return "[" + familiarName
	    + "," + formattedValue
	    + "," + manufactureYear
	    + ",'" + frontMotto
	    + "','" + backMotto
	    + "','" + frontImage
	    + "','" + backImage
	    + "','" + frontLabel
	    + "','" + backLabel
	    + "','" + valueDescription
	    + "'," + (ridgedEdge ? "ridges" : "smooth")
	    + ",'" + metallurgy
	    + "']";
    }
}
