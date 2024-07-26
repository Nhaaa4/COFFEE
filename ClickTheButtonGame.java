import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ClickTheButtonGame extends JFrame {
    private JButton button;
    private int score = 0;
    private JLabel scoreLabel;
    private Timer timer;
    private Random random;

    public ClickTheButtonGame() {
        // Set up the frame
        setTitle("Click the Button Game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Initialize random number generator
        random = new Random();

        // Set up the button
        button = new JButton("Click me!");
        button.setBounds(150, 150, 100, 50);
        button.addActionListener(new ButtonClickListener());
        add(button);

        // Set up the score label
        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setBounds(10, 10, 100, 30);
        add(scoreLabel);

        // Set up the timer to move the button
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveButton();
            }
        });
        timer.start();
    }

    private void moveButton() {
        int x = random.nextInt(getWidth() - button.getWidth());
        int y = random.nextInt(getHeight() - button.getHeight() - 30); // Subtracting 30 to avoid the label area
        button.setLocation(x, y);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            score++;
            scoreLabel.setText("Score: " + score);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClickTheButtonGame().setVisible(true);
            }
        });
    }
}
