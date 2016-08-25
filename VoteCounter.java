/**
 * 
 */
import javax.swing.JFrame;
/**
 * @author ֻ־׃כחס
 * @version 1.0
 */
public class VoteCounter {

    /**
     * drive the program
     * @param args commend line argument.
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new VoteCounterPanel());
        frame.pack();
        frame.setVisible(true);
    }

}
