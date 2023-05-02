package view;

import controller.BFSController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game implements ActionListener {

    public static final JFrame gameFrame = new JFrame("Welcome to the game!");
    private static final JButton backButton = new JButton("back");
    private static final JButton findFoodButton = new JButton("find food");
    private static final JLabel antPosition = new JLabel("ant position: ");
    private static final JLabel foodPosition = new JLabel("food position: ");
    public static final JTextField inputAntPosition = new JTextField(2);
    public static final JTextField inputFoodPosition = new JTextField(2);
    private static final Image icon = Toolkit.getDefaultToolkit().getImage("ant.png");

    private static final String way = "";
    private static final JLabel path = new JLabel(way);

    public Game() {
        JLabel answer = new JLabel("best way to food:");

        Container c = gameFrame.getContentPane();

        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("graph.png"));
        Dimension size = label.getPreferredSize();
        label.setBounds(170, 10, size.width, size.height);

        c.add(label);
        backButton.setBounds(10, 10, 70, 25);
        antPosition.setBounds(10, 50, 110, 20);
        foodPosition.setBounds(10, 75, 110, 20);
        inputAntPosition.setBounds(120, 50, 30, 20);
        inputFoodPosition.setBounds(120, 75, 30, 20);
        findFoodButton.setBounds(10, 110, 110, 25);
        answer.setBounds(10, 230, 150, 30);
        path.setBounds(10, 250, 200, 50);

        gameFrame.add(backButton);
        gameFrame.add(antPosition);
        gameFrame.add(foodPosition);
        gameFrame.add(inputAntPosition);
        gameFrame.add(inputFoodPosition);
        gameFrame.add(findFoodButton);
        gameFrame.add(answer);
        gameFrame.add(path);

        gameFrame.setIconImage(icon);
        gameFrame.setLayout(null);
        gameFrame.setSize(900, 500);
        gameFrame.setLocationRelativeTo(null); //display the frame to center position of a screen
        gameFrame.setVisible(true);

        findFoodButton.addActionListener(this);
        backButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == backButton) {
            new Menu();
            gameFrame.dispose();
        } else if (src == findFoodButton) {
            path.setText("");

            String source = inputAntPosition.getText().toUpperCase();
            String destination = inputFoodPosition.getText().toUpperCase();

            new BFSController(way, path, source, destination);

        }
    }
}