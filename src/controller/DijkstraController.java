package controller;

import model.DijkstraAlgorithm;
import model.Graph;
import model.Node;

import javax.swing.*;

import static model.Graph.generateGraph;

public class DijkstraController {

    public DijkstraController(String way, JLabel path, String source, String destination) {
        Graph graph = generateGraph();
        Node nodeSource = null;
        Node nodeDestination = null;

        //node source
        for (Node node : graph.getNodes()) {
            if (node.getName().equals(source)) {
                nodeSource = node;
            }
        }

        if (nodeSource != null) {
            DijkstraAlgorithm.calculateShortestPathFromSource(graph, nodeSource);
        } else {
            new JOptionPane();
            JOptionPane.showMessageDialog(null, "ant position not found");
        }

        //node destination
        for (Node node : graph.getNodes()) {
            if (node.getName().equals(destination)) {
                nodeDestination = node;
            }
        }

        if (nodeDestination != null) {
            for (Node node : nodeDestination.getShortestPath()) {
                String s = node.getName() + " - ";
                way += s;
            }
            way = way + nodeDestination.getName();
            path.setText(way);
        } else {
            new JOptionPane();
            JOptionPane.showMessageDialog(null, "food position not found");
        }
    }
}

