import java.util.Calendar;
import java.text.DecimalFormat;

public abstract class Coin {
    protected String familiarName;
    protected double value;
    protected String frontMotto;
    protected String backMotto;
    protected String frontLabel;
    protected String backLabel;
    protected String frontImage;
    protected String backImage;
    protected String valueDescription;
    protected boolean ridgedEdge;
    //protected String metallurgy;
    protected int manufactureYear;
    protected Metallurgy metallurgyType;
    
    public Coin() {
	    this((Calendar.getInstance()).get(Calendar.YEAR));
    }
	public Coin(int year){
		this.manufactureYear = year;
		this.frontMotto = "IN GOD WE TRUST";
		this.backMotto = "E PLURIBUS UNUM";
		this.frontLabel = "LIBERTY";
		this.backLabel = "UNITED STATES OF AMERICA";
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
	    return metallurgyType.Smelt();
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
            + ",'" + metallurgyType.Smelt()
            + "']";
    }


    public static class CoinCounts {
        private int totalCoins;
        private int pennies;
        private int nickels;
        private int dimes;
        private int quarters;
        private int halfDollars;
        private int dollars;
        public void incrementPenny() {
            pennies++;
            totalCoins++;
        }

        public void incrementNickel() {
            nickels++;
            totalCoins++;
        }

        public void incrementDime() {
            dimes++;
            totalCoins++;
        }

        public void incrementQuarter() {
            quarters++;
            totalCoins++;
        }

        public void incrementHalfDollar() {
            halfDollars++;
            totalCoins++;
        }

        public void incrementDollar() {
            dollars++;
            totalCoins++;
        }

    }
}
