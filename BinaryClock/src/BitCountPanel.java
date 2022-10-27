import javax.swing.*;
import java.awt.*;

public class BitCountPanel extends JPanel {

    JLabel label8 = new JLabel("8", JLabel.CENTER);
    JLabel label4 = new JLabel("4", JLabel.CENTER);
    JLabel label2 = new JLabel("2", JLabel.CENTER);
    JLabel label1 = new JLabel("1", JLabel.CENTER);
    BitCountPanel() {
        this.setBackground(new Color(0, 0, 0,0));
        this.setLayout(new GridLayout(6, 1));
        this.add(new JLabel()); //empty label

        label8.setFont(new Font("Arial", Font.BOLD, 20));
        label4.setFont(new Font("Arial", Font.BOLD, 20));
        label2.setFont(new Font("Arial", Font.BOLD, 20));
        label1.setFont(new Font("Arial", Font.BOLD, 20));


        this.add(label8);
        this.add(label4);
        this.add(label2);
        this.add(label1);
    }
}
