package TicTacToe;

import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class PanScore extends JPanel {

    JLabel lblScore = new JLabel();
    int nScore = 0;
    int nTime = 0;
    JLabel lblTime = new JLabel();
    String sTime;
    Timer tmrTime = new Timer(true);

    public PanScore() {
        lblScore.setText("Score: " + nScore);
        add(lblScore);
        
        tmrTime.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if(!FraMain.isHome){
                nTime++;
                sTime = Integer.toString(nTime);
                lblTime.setText("Time: " + sTime);
                add(lblTime);
                repaint();
                revalidate();
                }
                if(FraMain.isHome){
                    nTime=0;
                    revalidate();
                    repaint();
                }
            }
        }, 0, 1000);

    }
}
