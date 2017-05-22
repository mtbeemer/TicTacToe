package TicTacToe;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class PanDisp extends JPanel {

    public static PanGame pangame = new PanGame();
    public PanMain panmain = new PanMain();
    public PanScore panscore = new PanScore();
    public PanPrompt panprompt = new PanPrompt();
    public static PanMM panmm = new PanMM();

    public PanDisp() {
        setLayout(new BorderLayout());
        add(panmm, BorderLayout.WEST);
        add(pangame, BorderLayout.CENTER);
        add(panprompt, BorderLayout.SOUTH);
        add(panscore, BorderLayout.EAST);
    }
}
