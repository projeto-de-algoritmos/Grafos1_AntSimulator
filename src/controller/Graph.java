package controller;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node node) {
        nodes.add(node);
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }

    public static Graph generateGraph(){
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");

        nodeA.addDestination(nodeB, 1);
        nodeA.addDestination(nodeC, 1);

        nodeB.addDestination(nodeD, 1);
        nodeB.addDestination(nodeF, 1);

        nodeC.addDestination(nodeE, 1);

        nodeD.addDestination(nodeE, 1);
        nodeD.addDestination(nodeF, 1);

        nodeE.addDestination(nodeG, 1);

        nodeF.addDestination(nodeE, 1);
        nodeF.addDestination(nodeG, 1);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);
        graph.addNode(nodeG);

        return graph;
    }

}
