package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Info implements ActionListener {

    private static final JFrame infoFrame = new JFrame("Ant Simulator");
    private static final JLabel infoTitle = new JLabel("Informations");
    private static final JButton backButton = new JButton("back");
    private static final Image icon = Toolkit.getDefaultToolkit().getImage("ant.png");

    public Info() {
        JLabel text = new JLabel("Welcome to the Ant Simulator :)");
        JLabel text1 = new JLabel("Steps to play the game:");
        JLabel text2 = new JLabel("1. Input the ant and food positions");
        JLabel text3 = new JLabel("2. Click on the find button to generate your best way to food");
        JLabel text4 = new JLabel("The game will compute the best way to food using BFS Algorithm");
        JLabel text5 = new JLabel("Authors: Mateus Franco & Letícia Aires");

        infoTitle.setFont(new Font("Arial", Font.BOLD, 15));
        infoTitle.setBounds(225, 10, 350, 30);
        backButton.setBounds(10, 10, 70, 25);
        text.setBounds(10,50, 450,40);
        text1.setBounds(10,70, 450,40);
        text2.setBounds(20,100, 450,40);
        text3.setBounds(20,120, 450,40);
        text4.setBounds(10,150, 500,40);
        text5.setBounds(10,170, 450,40);

        infoFrame.add(infoTitle);
        infoFrame.add(backButton);
        infoFrame.add(text);
        infoFrame.add(text1);
        infoFrame.add(text2);
        infoFrame.add(text3);
        infoFrame.add(text4);
        infoFrame.add(text5);
        infoFrame.setIconImage(icon);

        infoFrame.setLayout(null);
        infoFrame.setSize(550, 250);
        infoFrame.setLocationRelativeTo(null); //display the frame to center position of a screen
        infoFrame.setVisible(true);

        backButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == backButton) {
            new Menu();
            infoFrame.dispose();
        }
    }
}
