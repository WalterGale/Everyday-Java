import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class DigitalClock extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel timeLabel;

    public DigitalClock() {
        setTitle("Digital Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        add(panel, BorderLayout.CENTER);

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 100));
        timeLabel.setForeground(Color.BLUE);
        panel.add(timeLabel);

        setVisible(true);

        new Thread(() -> {
            while (true) {
                LocalTime now = LocalTime.now();
                String time = String.format("%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
                timeLabel.setText(time);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new DigitalClock();
    }

}