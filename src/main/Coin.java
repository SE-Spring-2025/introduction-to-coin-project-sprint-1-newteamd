import java.util.Calendar;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

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
    protected static TotalCoins totalCoins;
    protected static CoinCounts coinCounts = new CoinCounts();
    
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
        private int pennyCount = 0;
        private int nickelCount = 0;
        private int dimeCount = 0;
        private int quarterCount = 0;
        private int halfDollarCount = 0;
        private int dollarCount = 0;
        private int coinCount = 0;
        //private ArrayList<Observer> quarterObservers = new ArrayList<>();
        //private ArrayList<Observer> coinObservers = new ArrayList<>();
        Observer totalCoinsObserver = new TotalCoins();
        Observer totalQuarterObserver = new TotalQuarters();

        public int getQuarterCount() {
            return quarterCount;
        }
        public int getCoinCount() {
            return coinCount;
        }

        public void incrementPenny()
        {
            pennyCount++;
            coinCount++;
            totalCoinsObserver.update();
            //notify(pennyObservers);
        }
        public void incrementNickel() {
            nickelCount++;
            coinCount++;
            totalCoinsObserver.update();
            //notify(nickelObservers);
        }
        public void incrementDime() {
            dimeCount++;
            coinCount++;
            totalCoinsObserver.update();
            //notify(dimeObservers);
        }
        public void incrementHalfDollar() {
            halfDollarCount++;
            coinCount++;
            totalCoinsObserver.update();
            //notify(halfDollarObservers);
        }
        public void incrementDollar() {
            dollarCount++;
            coinCount++;
            totalCoinsObserver.update();
            //notify(dollarObservers);
        }
        public void incrementQuarter() {
            quarterCount++;
            coinCount++;
            totalCoinsObserver.update();
            totalQuarterObserver.update();
            //notify(quarterObservers);
        }

        /*public void notify(ArrayList<Observer> observers) {
            for (Observer observer : quarterObservers) {
                observer.update();
            }
            for (Observer observer : coinObservers) {
                observer.update();
            }
        }*/

        /*public void addQuarterObserver(Observer observer) {
            quarterObservers.add(observer);
        }
        public void addCoinObserver(Observer observer) {
            coinObservers.add(observer);
        }*/

    }
}
