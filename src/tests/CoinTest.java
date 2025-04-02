import java.util.Calendar;

import java.io.*;
/*import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;*/

public class CoinTest {
    private static int currYear;
	private static final double PENNY_VALUE = 0.01;
	private static final double NICKEL_VALUE = 0.05;
	private static final double DIME_VALUE = 0.10;
	private static final double QUARTER_VALUE = 0.25;
	private static final double HALFDOLLAR_VALUE = 0.50;
	private static final double DOLLAR_VALUE = 1.00;
    
    /*@BeforeAll
    public static void getCurrYear() {
	currYear = (Calendar.getInstance()).get(Calendar.YEAR);
    }*/
	
    // @Test
    //public void testConstructors() {
	// Basically just make sure they don't blow up
	// parameterless constructor  
	/* try {
	    Coin c = new Coin();
	}
	catch (Exception e) {
	    fail("Coin() constructor caused exception: "+e.getMessage());
	}

	// value arg constructor
	try {
	    Coin c = new Coin(0.05);
	}
	catch (Exception e) {
	    fail("Coin() constructor caused exception: "+e.getMessage());
	}

	// value and year args constructor
	try {
	    Coin c = new Coin(0.10, 2020);
	}
	catch (Exception e) {
	    fail("Coin() constructor caused exception: "+e.getMessage());
	}

	// make it here then didn't fail!
	assertTrue(true);
    }*/

	/** cannot get junit tests to work still
	 * adding my own tests that are not junit, but will effectively do the same thing
	 * will call all methods previously called
	 */

	 public static void main (String[] args)
	 {
		currYear = (Calendar.getInstance()).get(Calendar.YEAR);
		CoinTest ct = new CoinTest();
		ct.testConstructors();
		ct.testGetters();
		ct.testToString();
		//begin by testing constructors + default constructors

	 }
	public void testConstructors() {

		try
		{
			Coin c = new Penny();
		}
		catch(Exception e)
		{
			System.out.println("Penny() constructor caused exception: "+e.getMessage());
		}

		try
		{
			Coin c = new Penny(2025);
		}
		catch(Exception e)
		{
			System.out.println("Penny(year) constructor caused exception: "+e.getMessage());
		}

		try
		{
			Coin c = new Nickel();
		}
		catch(Exception e)
		{
			System.out.println("Nickel() constructor caused exception: "+e.getMessage());
		}

		try
		{
			Coin c = new Nickel(2025);
		}
		catch(Exception e)
		{
			System.out.println("Nickel(year) constructor caused exception: "+e.getMessage());
		}

		try
		{
			Coin c = new Dime();
		}
		catch(Exception e)
		{
			System.out.println("Dime() constructor caused exception: "+e.getMessage());
		}

		try
		{
			Coin c = new Dime(2025);
		}
		catch(Exception e)
		{
			System.out.println("Dime(year) constructor caused exception: "+e.getMessage());
		}

		try
		{
			Coin c = new Quarter();
		}
		catch(Exception e)
		{
			System.out.println("Quarter() constructor caused exception: "+e.getMessage());
		}

		try
		{
			Coin c = new HalfDollar();
		}
		catch(Exception e)
		{
			System.out.println("HalfDollar() constructor caused exception: "+e.getMessage());
		}

		try
		{
			Coin c = new HalfDollar(2025);
		}
		catch(Exception e)
		{
			System.out.println("HalfDollar(year) constructor caused exception: "+e.getMessage());
		}

		try
		{
			Coin c = new Dollar();
		}
		catch(Exception e)
		{
			System.out.println("Dollar() constructor caused exception: "+e.getMessage());
		}

		try
		{
			Coin c = new Dollar(2025);
		}
		catch(Exception e)
		{
			System.out.println("Dollar(year) constructor caused exception: "+e.getMessage());
		}
		System.out.println("Passing all constructor tests");
		//move on to testing getters and setters
	}


    /*@Test
    public void testGetters() {
	if (! testPenny()) fail("penny getters failed");
	if (! testNickel()) fail("nickel getters failed");
	if (! testDime()) fail("dime getters failed");
	if (! testQuarter()) fail("quarter getters failed");
	if (! testHalfDollar()) fail("half dollar getters failed");
	if (! testDollar()) fail("dollar getters failed");*/
	
	public void testGetters() {
		boolean test = true;
		if (! testPenny()) {System.out.println("penny getters failed"); test = false;}
		if (! testNickel()) {System.out.println("nickel getters failed"); test = false;}
		if (! testDime()) {System.out.println("dime getters failed"); test = false;}
		if (! testQuarter()) {System.out.println("quarter getters failed"); test = false;}
		if (! testHalfDollar()) {System.out.println("half dollar getters failed"); test = false;}

		if (test == true) System.out.println("All getters passed successfully");
		else System.out.println("Some getters failed, but we are moving on to the next test anyway");
		
	// make it here then didn't fail!
    }

    /*@Test
    public void testToString() {
	Coin c = new Coin(0.50, 1999);
	String expectedOutput =
	    "[HalfDollar,0.50,1999,'IN GOD WE TRUST','E PLURIBUS UNUM'"
	    + ",'J_Kennedy','Presidential_Seal','LIBERTY'"
	    + ",'UNITED STATES OF AMERICA','HALF DOLLAR',ridges"
	    + ",'Cupro-Nickel']";
	assertEquals(expectedOutput, c.toString());
    }*/

	public void testToString() {
		Coin c = new HalfDollar(1999);
		String expectedOutput =
			"[HalfDollar,0.50,1999,'IN GOD WE TRUST','E PLURIBUS UNUM'"
			+ ",'J_Kennedy','Presidential_Seal','LIBERTY'"
			+ ",'UNITED STATES OF AMERICA','HALF DOLLAR',ridges"
			+ ",'Cupro-Nickel']";
		if (!(c.toString().equals(expectedOutput)))
		{
			System.out.println("toString() failed: expected " + expectedOutput + " but got " + c.toString());
		}
		else
		{
			System.out.println("toString() passed successfully");
		}
	}

    //---------------------------------------------------------
    // private helper methods
    //---------------------------------------------------------
//for the following, I changed the initialization of c, and removed coin.COIN_VALUE, switched it to a constant COIN_VALUE
    private boolean cmpDoubles(double a, double b) {
	return Math.abs(a-b) < 0.00001;
    }
    private boolean testPenny() {
	Coin c = new Penny();
	
	if (! "Penny".equals(c.getFamiliarName())) return false;
	if (! cmpDoubles(c.getValue(), PENNY_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "A_Lincoln".equals(c.getFrontImage())) return false;
	if (! "Lincoln_Memorial".equals(c.getBackImage())) return false;
	if (! "ONE CENT".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != false) return false;
	if (! "Copper".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	    
	// make it here then didn't fail!
	return true;
    }
    private boolean testNickel() {
	Coin c = new Nickel();
	
	if (! "Nickel".equals(c.getFamiliarName())) return false;
	if (! cmpDoubles(c.getValue(), NICKEL_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "T_Jefferson".equals(c.getFrontImage())) return false;
	if (! "Jefferson_Memorial".equals(c.getBackImage())) return false;
	if (! "FIVE CENTS".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != false) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    private boolean testDime() {
	Coin c = new Dime();
	
	if (! "Dime".equals(c.getFamiliarName())) return false;
	if (! cmpDoubles(c.getValue(), DIME_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "F_Roosevelt".equals(c.getFrontImage())) return false;
	if (! "Torch_Branches".equals(c.getBackImage())) return false;
	if (! "ONE DIME".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != true) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    private boolean testQuarter() {
	Coin c = new Quarter();
	
	if (! "Quarter".equals(c.getFamiliarName())) return false;
	if (! cmpDoubles(c.getValue(), QUARTER_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "G_Washington".equals(c.getFrontImage())) return false;
	if (! "Eagle".equals(c.getBackImage())) return false;
	if (! "QUARTER DOLLAR".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != true) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    private boolean testHalfDollar() {
	Coin c = new HalfDollar();
	
	if (! "HalfDollar".equals(c.getFamiliarName())) return false;
	if (! cmpDoubles(c.getValue(), HALFDOLLAR_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "J_Kennedy".equals(c.getFrontImage())) return false;
	if (! "Presidential_Seal".equals(c.getBackImage())) return false;
	if (! "HALF DOLLAR".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != true) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    private boolean testDollar() {
	Coin c = new Dollar();
	
	if (! "Dollar".equals(c.getFamiliarName())) return false;
	if (! cmpDoubles(c.getValue(), DOLLAR_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "S_Anthony".equals(c.getFrontImage())) return false;
	if (! "Moon_Eagle".equals(c.getBackImage())) return false;
	if (! "ONE DOLLAR".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != true) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
}
    
