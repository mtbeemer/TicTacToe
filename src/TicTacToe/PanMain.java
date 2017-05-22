package TicTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanMain extends JPanel{
    JButton btnGame = new JButton();
    public PanMain(){ 
        setLayout(null);
        btnGame.setText("Play!");
        btnGame.setBounds(10, 10, 475, 475);
        add(btnGame);
    } 
}
