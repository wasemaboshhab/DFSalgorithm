public class Main {
    public static void main(String[] args) {

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


        nodeA.addNeighbor(nodeB);
        nodeA.addNeighbor(nodeC);

        nodeB.addNeighbor(nodeD);
        nodeB.addNeighbor(nodeE);

        nodeD.addNeighbor(nodeH);

        nodeE.addNeighbor(nodeI);
        nodeE.addNeighbor(nodeJ);

        nodeC.addNeighbor(nodeF);
        nodeC.addNeighbor(nodeG);

        nodeF.addNeighbor(nodeK);


//        new DFS().runDfs(nodeA);
        System.out.println("recursive: ");
        new DFS().runRecursive(nodeA);

    }
}
