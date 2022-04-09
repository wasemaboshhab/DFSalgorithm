import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;
    private boolean visited;
    private List<Node> neighbors;

    public Node(String name) {
        this.name = name;
        this.visited = false;
        this.neighbors = new ArrayList<>();

    }

    public void addNeighbor(Node neighbor) {
        neighbors.add(neighbor);

    }
    public String toString() {
        return this.name;
    }

    public boolean isVisited() {
        return this.visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
        System.out.println(this);

    }

    public List<Node> getNeighbors() {
        return this.neighbors;
    }
}
