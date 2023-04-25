import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game implements ActionListener {

    private static final JFrame gameFrame = new JFrame("Ant Simulator");
    private static final JLabel gameTitle = new JLabel("Welcome to the game!");
    private static final JButton backButton = new JButton("back");
    private static final JButton findButton = new JButton("find food");
    private static final JLabel antPosition = new JLabel("ant position: ");
    private static final JLabel foodPosition = new JLabel("food position: ");
    private static final JTextField inputAntPosition = new JTextField(2);
    private static final JTextField inputFoodPosition = new JTextField(2);
    private static final Image icon = Toolkit.getDefaultToolkit().getImage("ant.png");

    public Game() {
        JLabel answer = new JLabel("best way to food: ");

        Container c = gameFrame.getContentPane(); //Gets the content layer

        JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("graph.png")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(150, 50, size.width, size.height); //Sets the location of the image

        c.add(label);

        gameTitle.setFont(new Font("Arial", Font.BOLD, 15));
        gameTitle.setBounds(200, 10, 200, 30);
        backButton.setBounds(10, 10, 70, 25);
        antPosition.setBounds(10, 50, 80, 20);
        foodPosition.setBounds(10, 75, 80, 20);
        inputAntPosition.setBounds(100, 50, 30, 20);
        inputFoodPosition.setBounds(100, 75, 30, 20);
        findButton.setBounds(10, 110, 110, 25);
        answer.setBounds(20, 170, 110, 30);

        gameFrame.add(gameTitle);
        gameFrame.add(backButton);
        gameFrame.add(antPosition);
        gameFrame.add(foodPosition);
        gameFrame.add(inputAntPosition);
        gameFrame.add(inputFoodPosition);
        gameFrame.add(findButton);
        gameFrame.add(answer);
        gameFrame.setIconImage(icon);

        gameFrame.setLayout(null);
        gameFrame.setSize(500, 350);
        gameFrame.setLocationRelativeTo(null); //display the frame to center position of a screen
        gameFrame.setVisible(true);

        backButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == backButton) {
            new Menu();
            gameFrame.dispose();
        }
    }
}
