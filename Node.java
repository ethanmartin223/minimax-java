import java.util.ArrayList;

public class Node {

    private Node parent;
    private ArrayList<Node> children;
    private int value;

    public Node(int value) {
        this.parent = null;
        this.children = new ArrayList<>();
    }

    public Node(int value, Node parent) {
        this.parent = parent;
        this.children = new ArrayList<>();
    }

    public static Node getInstance() {return null;}

    public void addChild(int v) {
        this.children.add(new Node(v, this));
    }
}
