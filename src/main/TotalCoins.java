
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TotalCoins implements Observer{
    /**
     * has static count variable, as well as its own frame and JLabel to display the counts
     */
    private static int totalCoins = 0;
    private JFrame totalFrame = new JFrame("Total Coins");
    private JLabel totalLabel = new JLabel("Total Coins: " + totalCoins); 
    
    /**
     * Increments coin type, and updates JLabel accordingly...
     * probably could clean up and set the size and things that wont change somewhere else
     */
    public void update()
    {
        totalCoins++;
        totalLabel.setText("Total Coins: " + totalCoins);
        totalFrame.add(totalLabel);
        totalFrame.setSize(200, 100);
        totalFrame.setLocation(200, 0);
        totalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        totalFrame.setVisible(true);
    }

    /**
     * 
     * @return the label for TotalCoins, not useful now but could be later if we want to add a 
     * better display that has all of the labels
      */
    public JLabel getTotalLabel() {
        return totalLabel;
    }
}