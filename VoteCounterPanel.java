/**
 * 
 */
import java.awt.*;
import java.awt.event.*;
import javax. swing. *;
/**
 * @author ËÎÓëçñ
 * @version 1.0
 */
public class VoteCounterPanel extends JPanel{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * @param args
     */
        // TODO Auto-generated method stub
        private int votesForJoe;
        private int votesForSam;
        private JButton joe;
        private JButton sam;
        private JLabel labelJoe;
        private JLabel labelSam;
        // ------------------------------------------------
        // Constructor: Sets up the GUI.
        // ------------------------------------------------
        public VoteCounterPanel()
        
        {
        votesForJoe = 0;
        joe = new JButton("Vote for Joe");
        joe.addActionListener(new JoeButtonListener());
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        add(joe);
        add(labelJoe);
        setPreferredSize(new Dimension(300, 40));
        setBackground(Color.cyan);

        votesForSam = 0;
        sam = new JButton("Vote for Sam");
        sam.addActionListener(new SamButtonListener());
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        add(sam);
        add(labelSam);
        setPreferredSize(new Dimension(500, 80));
        }
        // **************************************************
        // Represents a listener for button push (action) events
        // **************************************************
        private class JoeButtonListener implements ActionListener
        {
        //---------------------------------------------
        // Updates the counter and label when Vote for Joe
        // button is pushed
        //---------------------------------------------
        public void actionPerformed(ActionEvent event)
        {
        votesForJoe++;
        labelJoe.setText("Votes for Joe: " + votesForJoe);
        }
    }
        private class SamButtonListener implements ActionListener
        {
        //---------------------------------------------
        // Updates the counter and label when Vote for Sam
        // button is pushed
        //---------------------------------------------
        public void actionPerformed(ActionEvent event)
        {
        votesForSam++;
        labelSam.setText("Votes for Sam: " + votesForSam);
        }
    }
}
