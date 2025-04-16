import javax.swing.*;

public class TotalQuarters implements Observer{
    private static int totalQuarters = 0;
    private JFrame quartFrame = new JFrame("Total Quarters");
    private JLabel quarterLabel = new JLabel("Total Quarters: " + totalQuarters); 

    
    public void update()
    {
        totalQuarters++;
        quarterLabel.setText("Total Quarters: " + totalQuarters);
        quartFrame.add(quarterLabel);
        quartFrame.setSize(200, 100);
        quartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quartFrame.setVisible(true);

    }

    public JLabel getQuarterLabel() {
        return quarterLabel;
    }
}