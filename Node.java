import java.util.ArrayList;
import java.util.List;

public class Node {

    private final Node parent;
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

    public List<Node> getChildren() {return children.size()>0?children:null;}

    public Node getParent() {return parent;}

    public int getValue() {return value;};

    public List<Node> minimax(Node startingNode) {
        for
    }
}
