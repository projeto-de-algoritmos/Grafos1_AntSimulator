package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {

    private static final JFrame frame = new JFrame("Ant Simulator");
    private static final JLabel title = new JLabel("Ant Simulator");
    private static final JButton playButton = new JButton("play");
    private static final JButton infoButton = new JButton("info");
    private static final JButton quitButton = new JButton("quit");

    public Menu() {
        Image icon = Toolkit.getDefaultToolkit().getImage("ant.png");

        title.setFont(new Font("Arial", Font.BOLD, 15));
        title.setBounds(140, 10, 150, 30);
        playButton.setBounds(140, 50, 100, 30);
        infoButton.setBounds(140, 100, 100, 30);
        quitButton.setBounds(140, 150, 100, 30);

        frame.setLayout(null);
        frame.add(title);
        frame.add(playButton);
        frame.add(infoButton);
        frame.add(quitButton);
        frame.setIconImage(icon);

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); //display the frame to center position of a screen
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();

        playButton.addActionListener(menu);
        infoButton.addActionListener(menu);
        quitButton.addActionListener(menu);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == playButton) {
            new Game();
            frame.dispose();
        } else if (src == infoButton) {
            new Info();
            frame.dispose();
        } else if (src == quitButton) {
            frame.dispose();
        }
    }

}