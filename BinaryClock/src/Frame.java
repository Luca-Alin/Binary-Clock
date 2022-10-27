import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class Frame extends JFrame {
    JPanel backPanel = new JPanel();

    BitCountPanel bitCountPanelWest = new BitCountPanel();
    JLabel hhmmssLabelSouth = new JLabel("00:00:00", JLabel.CENTER);

    JPanel centerPanel = new JPanel();
    JPanel centerPanelHour = new JPanel();
    JPanel centerPanelMinute = new JPanel();
    JPanel centerPanelSecond = new JPanel();

    HourPanel hourPanel = new HourPanel();
    MinutePanel minutePanel = new MinutePanel();
    SecondPanel secondPanel = new SecondPanel();

    Frame() {
        this.setTitle("Binary clock");
        this.setSize(   (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
                        (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());


        backPanel.setBackground(new Color(200, 200, 200));
        backPanel.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new Color(0, 0, 0, 0)));
        backPanel.setLayout(new BorderLayout());
        this.add(backPanel);


        bitCountPanelWest.setPreferredSize(new Dimension(50, 50));
        backPanel.add(bitCountPanelWest, BorderLayout.WEST);


        hhmmssLabelSouth.setFont(new Font("Arial", Font.BOLD, 25));
        backPanel.add(hhmmssLabelSouth, BorderLayout.SOUTH);


        centerPanelHour.setBackground(new Color(0, 0, 0, 0));
        centerPanelHour.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new Color(0, 0, 0, 0)));
        centerPanelHour.setLayout(new GridLayout(1, 1));
        centerPanelHour.add(hourPanel);


        centerPanelMinute.setBackground(new Color(0, 0, 0, 0));
        centerPanelMinute.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new Color(0, 0, 0, 0)));
        centerPanelMinute.setLayout(new GridLayout(1, 1));
        centerPanelMinute.add(minutePanel);


        centerPanelSecond.setBackground(new Color(0, 0, 0, 0));
        centerPanelSecond.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new Color(0, 0, 0, 0)));
        centerPanelSecond.setLayout(new GridLayout(1, 1));
        centerPanelSecond.add(secondPanel);


        centerPanel.setBackground(new Color(0, 0, 0, 0));
        centerPanel.setLayout(new GridLayout(1, 3));
        centerPanel.add(centerPanelHour);
        centerPanel.add(centerPanelMinute);
        centerPanel.add(centerPanelSecond);

        backPanel.add(centerPanel, BorderLayout.CENTER);



        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            hhmmssLabelSouth.setText(hourPanel.setSecond(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)) + ":" +
            minutePanel.setSecond(Calendar.getInstance().get(Calendar.MINUTE)) + ":" +
            secondPanel.setSecond(Calendar.getInstance().get(Calendar.SECOND)));

        }


    }
}