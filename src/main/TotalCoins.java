
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TotalCoins implements Observer{
    private static int totalCoins = 0;
    private JFrame totalFrame = new JFrame("Total Coins");
    private JLabel totalLabel = new JLabel("Total Coins: " + totalCoins); 
    
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

    public JLabel getTotalLabel() {
        return totalLabel;
    }
}