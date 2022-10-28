import javax.swing.*;
import java.awt.*;

public class SecondPanel extends JPanel {

    Image bitON = new ImageIcon(getClass().getResource("ON.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    Image bitOFF = new ImageIcon(getClass().getResource("OFF.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);

    JLabel leftDigitLabel = new JLabel("0", JLabel.CENTER);
    JLabel rightDigitLabel = new JLabel("0", JLabel.CENTER);
    JLabel[] bitLabels = new JLabel[8];

    SecondPanel() {
        this.setBackground(new Color(231, 230, 253));
        this.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new Color(6, 0, 206)));
        this.setLayout(new GridLayout(6, 2));


        JLabel timeLetter1 = new JLabel("S", JLabel.CENTER); //S for second
        JLabel timeLetter2 = new JLabel("S", JLabel.CENTER); //S for second
        timeLetter1.setFont(new Font("Arial", Font.BOLD, 20));
        timeLetter2.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(timeLetter1);
        this.add(timeLetter2);


        for (int i = 0; i < 8; i++) {
            bitLabels[i] = new JLabel("", JLabel.CENTER);
            bitLabels[i].setBorder(BorderFactory.createMatteBorder(10, 20, 20, 10, new Color(231, 230, 253)));
        }
        this.add(bitLabels[0]);
        this.add(bitLabels[1]);
        this.add(bitLabels[2]);
        this.add(bitLabels[3]);
        this.add(bitLabels[4]);
        this.add(bitLabels[5]);
        this.add(bitLabels[6]);
        this.add(bitLabels[7]);


        leftDigitLabel.setFont(new Font("Arial", Font.BOLD, 20));
        rightDigitLabel.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(leftDigitLabel);
        this.add(rightDigitLabel);
    }

    String setSecond(int second) {
        String SS = "0" + second;
        int leftDigit = Integer.parseInt(SS.charAt(SS.length() - 2) + "");
        int rightDigit = Integer.parseInt(SS.charAt(SS.length() - 1) + "");
        int leftDigitCopy = leftDigit, rightDigitCopy = rightDigit;
        leftDigitLabel.setText(leftDigit + " ");
        rightDigitLabel.setText(rightDigit + " ");
        bitLabels[2].setIcon(new ImageIcon(bitOFF));
        bitLabels[4].setIcon(new ImageIcon(bitOFF));
        bitLabels[6].setIcon(new ImageIcon(bitOFF));
        if (leftDigit - 4 >= 0){
            leftDigit -= 4;
            bitLabels[2].setIcon(new ImageIcon(bitON));
        }
        if (leftDigit - 2 >= 0){
            leftDigit -= 2;
            bitLabels[4].setIcon(new ImageIcon(bitON));
        }
        if (leftDigit - 1 >= 0){
            leftDigit -= 1;
            bitLabels[6].setIcon(new ImageIcon(bitON));
        }

        bitLabels[1].setIcon(new ImageIcon(bitOFF));
        bitLabels[3].setIcon(new ImageIcon(bitOFF));
        bitLabels[5].setIcon(new ImageIcon(bitOFF));
        bitLabels[7].setIcon(new ImageIcon(bitOFF));
        if (rightDigit - 8 >= 0){
            rightDigit -= 8;
            bitLabels[1].setIcon(new ImageIcon(bitON));
        }
        if (rightDigit - 4 >= 0){
            rightDigit -= 4;
            bitLabels[3].setIcon(new ImageIcon(bitON));
        }
        if (rightDigit - 2 >= 0){
            rightDigit -= 2;
            bitLabels[5].setIcon(new ImageIcon(bitON));
        }
        if (rightDigit - 1 >= 0){
            rightDigit -= 1;
            bitLabels[7].setIcon(new ImageIcon(bitON));
        }
        return leftDigitCopy + "" + rightDigitCopy;
    }
}