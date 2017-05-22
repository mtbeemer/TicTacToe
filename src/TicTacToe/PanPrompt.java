package TicTacToe;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PanPrompt extends JPanel {

    public static JLabel lblTurn = new JLabel();
    static boolean isX;

    static void set(boolean _isX) {
        isX = _isX;
    }

    public PanPrompt() {
         lblTurn.setFont(new Font("ALGERIAN", Font.PLAIN, 20));
       add(lblTurn);
    }
}
