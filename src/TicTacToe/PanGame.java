package TicTacToe;

import static TicTacToe.AiCheck.isX;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanGame extends JPanel implements ActionListener {

    static boolean isX = true;
    static int arnN[] = new int[9];
    int nCount = 0, nBtn = 0;
    static JButton btn[] = new JButton[9];
    String don;
    JLabel lblWin = new JLabel();
    JLabel lblcats = new JLabel();

    public PanGame() {
        lblcats.setText("Cat's Game. :D");
        lblcats.setFont(new Font("ALGERIAN", Font.PLAIN, 20));
        lblWin.setFont(new Font("ALGERIAN", Font.PLAIN, 20));
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            btn[i] = new JButton();
            btn[i].setFont(new Font("ALGERIAN", Font.PLAIN, 50));
            btn[i].addActionListener(this);
            add(btn[i]);
        }
    }

    static void set(boolean _isX) {
        isX = _isX;
    }

    public void actionPerformed(ActionEvent evt) {
        System.out.println(isX);
        int j = 0;
        for (int i = 0; i < 9; i++) {
            if (evt.getSource() == btn[i]) {
                j = i;
                break;
            }
        }
        System.out.println(isX);
        if (isX) {
            isX = false;
            btn[j].setText("X");
            arnN[j] = 1;
            PanPrompt.lblTurn.setText("Player 2's Turn (O)");
        } else {
            isX = true;
            btn[j].setText("O");
            arnN[j] = 2;
            PanPrompt.lblTurn.setText("Player 1's Turn (X)");
        }
        btn[j].setEnabled(false);
        if (PanMM.rbTwo.isSelected()) {
            WinCheck.set(arnN, isX);
        } else if (PanMM.rbAI.isSelected()) {
            AiCheck.set(arnN, isX);
        }
        nCount++;
        if (nCount == 9) {
            for (int i = 0; i < 9; i++) {
                if (arnN[i] == 1 || arnN[i] == 2) {
                    nBtn++;
                }
            }

            if (PanMM.rbTwo.isSelected()) {
                WinCheck.print();
            } else if (PanMM.rbAI.isSelected()) {
                AiCheck.print();
            }
        }
        if (PanMM.rbTwo.isSelected()) {
            WinCheck.Check();
        } else if (PanMM.rbAI.isSelected()) {
            AiCheck.Check();
        }
        if (nBtn == 9) {
            System.out.println("all");
            for (int bry = 0; bry < 9; bry++) {
                remove(btn[bry]);
            }
            System.out.println("all");
            add(lblcats);
        }
    }

    void UpdawgX() {
        for (int don = 0; don < 9; don++) {
            remove(btn[don]);
        }
        lblWin.setText("Player 1 wins! (X)");
        add(lblWin);
        repaint();
        revalidate();
    }

    void UpdawgO() {
        for (int don = 0; don < 9; don++) {
            remove(btn[don]);
        }
        lblWin.setText("Player 2 wins! (O)");
        add(lblWin);
        repaint();
        revalidate();
    }

    void reset() {
        for (int beems = 0; beems < 9; beems++) {
            btn[beems].setText("");
            btn[beems].setEnabled(true);
            arnN[beems] = 0;
            add(btn[beems]);
            remove(lblcats);
            remove(lblWin);
            repaint();
            revalidate();
        }
    }

    static void X() {
        if (!isX) {
            PanGame.btn[2].setText("O");
            PanGame.btn[2].setEnabled(false);
            PanGame.set(isX);
            arnN[2] = 2;
        }
    }
}
