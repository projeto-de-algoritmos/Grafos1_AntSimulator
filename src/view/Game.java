package view;

import controller.Graph;
import controller.Node;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import static controller.DijkstraAlgorithm.calculateShortestPathFromSource;
import static controller.Graph.generateGraph;

public class Game implements ActionListener {

    private static final JFrame gameFrame = new JFrame("Welcome to the game!");
    private static final JButton backButton = new JButton("back");
    private static final JButton findButton = new JButton("find food");
    private static final JLabel antPosition = new JLabel("ant position: ");
    private static final JLabel foodPosition = new JLabel("food position: ");
    private static final JTextField inputAntPosition = new JTextField(2);
    private static final JTextField inputFoodPosition = new JTextField(2);
    private static final Image icon = Toolkit.getDefaultToolkit().getImage("ant.png");

    public Game() {
        JLabel answer = new JLabel("best way to food:");

        Container c = gameFrame.getContentPane(); //Gets the content layer

        JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("graph.png")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(170, 10, size.width, size.height); //Sets the location of the image

        c.add(label);
        backButton.setBounds(10, 10, 70, 25);
        antPosition.setBounds(10, 50, 110, 20);
        foodPosition.setBounds(10, 75, 110, 20);
        inputAntPosition.setBounds(120, 50, 30, 20);
        inputFoodPosition.setBounds(120, 75, 30, 20);
        findButton.setBounds(10, 110, 110, 25);
        answer.setBounds(10, 170, 130, 30);

        gameFrame.add(backButton);
        gameFrame.add(antPosition);
        gameFrame.add(foodPosition);
        gameFrame.add(inputAntPosition);
        gameFrame.add(inputFoodPosition);
        gameFrame.add(findButton);
        gameFrame.add(answer);
        gameFrame.setIconImage(icon);

        gameFrame.setLayout(null);
        gameFrame.setSize(630, 310);
        gameFrame.setLocationRelativeTo(null); //display the frame to center position of a screen
        gameFrame.setVisible(true);

        findButton.addActionListener(this);
        backButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == backButton) {
            new Menu();
            gameFrame.dispose();
        } else if (src == findButton) {
            Graph graph = generateGraph();

            String source = inputAntPosition.getText().toUpperCase();
            Node nodeSource = null;

            for (Node node : graph.getNodes()) {
                if (node.getName().equals(source)) {
                    nodeSource = node;
                }
            }

            graph = calculateShortestPathFromSource(graph, nodeSource);

            String destination = inputFoodPosition.getText().toUpperCase();
            Node nodeDestination = null;

            for (Node node : graph.getNodes()) {
                if (node.getName().equals(destination)) {
                    nodeDestination = node;
                }
            }

            for (Node node : nodeDestination.getShortestPath()){
                System.out.print(node.getName() + "-");
            }
            System.out.println(nodeDestination.getName());
            System.out.println();
        }
    }
}
