import java.util.Stack;

public class DFS {

    public void runDfs(Node start) {
        Stack<Node> stack = new Stack<>();
        stack.add(start);
        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();
            if (!currentNode.isVisited()) {
                currentNode.setVisited(true);
                for (Node neighbor : currentNode.getNeighbors()) {
                    if (!neighbor.isVisited()) {
                        stack.add(neighbor);
                    }
                }
            }
        }
    }

    public void runRecursive(Node node) {
        if (!node.isVisited()) {
            node.setVisited(true);
            for (Node neighbor : node.getNeighbors()) {
                if (!neighbor.isVisited()) {
                    runRecursive(neighbor);
                }
            }
        }
    }
}
