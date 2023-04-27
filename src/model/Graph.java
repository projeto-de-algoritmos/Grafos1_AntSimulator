package model;

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
        Node nodeH = new Node("H");
        Node nodeI = new Node("I");
        Node nodeJ = new Node("J");
        Node nodeK = new Node("K");
        Node nodeL = new Node("L");
        Node nodeM = new Node("M");
        Node nodeN = new Node("N");
        Node nodeO = new Node("O");
        Node nodeP = new Node("P");
        Node nodeQ = new Node("Q");
        Node nodeR = new Node("R");
        Node nodeS = new Node("S");
        Node nodeT = new Node("T");
        Node nodeU = new Node("U");
        Node nodeV = new Node("V");
        Node nodeW = new Node("W");
        Node nodeX = new Node("X");

        nodeA.addDestination(nodeB, 1);
        nodeA.addDestination(nodeG, 1);

        nodeB.addDestination(nodeA, 1);
        nodeB.addDestination(nodeC, 1);
        nodeB.addDestination(nodeH, 1);

        nodeC.addDestination(nodeB, 1);
        nodeC.addDestination(nodeD, 1);
        nodeC.addDestination(nodeI, 1);

        nodeD.addDestination(nodeC, 1);
        nodeD.addDestination(nodeE, 1);
        nodeD.addDestination(nodeJ, 1);

        nodeE.addDestination(nodeD, 1);
        nodeE.addDestination(nodeF, 1);
        nodeE.addDestination(nodeK, 1);

        nodeF.addDestination(nodeE, 1);
        nodeF.addDestination(nodeL, 1);

        nodeG.addDestination(nodeA, 1);
        nodeG.addDestination(nodeH, 1);
        nodeG.addDestination(nodeM, 1);

        nodeH.addDestination(nodeB, 1);
        nodeH.addDestination(nodeG, 1);
        nodeH.addDestination(nodeI, 1);
        nodeH.addDestination(nodeN, 1);

        nodeI.addDestination(nodeC, 1);
        nodeI.addDestination(nodeH, 1);
        nodeI.addDestination(nodeJ, 1);
        nodeI.addDestination(nodeO, 1);

        nodeJ.addDestination(nodeD, 1);
        nodeJ.addDestination(nodeI, 1);
        nodeJ.addDestination(nodeK, 1);
        nodeJ.addDestination(nodeP, 1);

        nodeK.addDestination(nodeE, 1);
        nodeK.addDestination(nodeJ, 1);
        nodeK.addDestination(nodeL, 1);
        nodeK.addDestination(nodeQ, 1);

        nodeL.addDestination(nodeF, 1);
        nodeL.addDestination(nodeK, 1);
        nodeL.addDestination(nodeR, 1);

        nodeM.addDestination(nodeG, 1);
        nodeM.addDestination(nodeN, 1);
        nodeM.addDestination(nodeS, 1);

        nodeN.addDestination(nodeH, 1);
        nodeN.addDestination(nodeM, 1);
        nodeN.addDestination(nodeO, 1);
        nodeN.addDestination(nodeT, 1);

        nodeO.addDestination(nodeI, 1);
        nodeO.addDestination(nodeN, 1);
        nodeO.addDestination(nodeP, 1);
        nodeO.addDestination(nodeU, 1);

        nodeP.addDestination(nodeJ, 1);
        nodeP.addDestination(nodeO, 1);
        nodeP.addDestination(nodeQ, 1);
        nodeP.addDestination(nodeV, 1);

        nodeQ.addDestination(nodeK, 1);
        nodeQ.addDestination(nodeP, 1);
        nodeQ.addDestination(nodeR, 1);
        nodeQ.addDestination(nodeW, 1);

        nodeR.addDestination(nodeL, 1);
        nodeR.addDestination(nodeQ, 1);
        nodeR.addDestination(nodeX, 1);

        nodeS.addDestination(nodeM, 1);
        nodeS.addDestination(nodeT, 1);

        nodeT.addDestination(nodeS, 1);
        nodeT.addDestination(nodeN, 1);
        nodeT.addDestination(nodeU, 1);

        nodeU.addDestination(nodeT, 1);
        nodeU.addDestination(nodeO, 1);
        nodeU.addDestination(nodeV, 1);

        nodeV.addDestination(nodeU, 1);
        nodeV.addDestination(nodeP, 1);
        nodeV.addDestination(nodeW, 1);

        nodeW.addDestination(nodeV, 1);
        nodeW.addDestination(nodeQ, 1);
        nodeW.addDestination(nodeX, 1);

        nodeX.addDestination(nodeW, 1);
        nodeX.addDestination(nodeR, 1);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);
        graph.addNode(nodeG);
        graph.addNode(nodeH);
        graph.addNode(nodeI);
        graph.addNode(nodeJ);
        graph.addNode(nodeK);
        graph.addNode(nodeL);
        graph.addNode(nodeM);
        graph.addNode(nodeN);
        graph.addNode(nodeO);
        graph.addNode(nodeP);
        graph.addNode(nodeQ);
        graph.addNode(nodeR);
        graph.addNode(nodeS);
        graph.addNode(nodeT);
        graph.addNode(nodeU);
        graph.addNode(nodeV);
        graph.addNode(nodeW);
        graph.addNode(nodeX);

        return graph;
    }

}
