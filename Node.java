import java.util.ArrayList;
import java.util.List;

public class Node {

    private final Node parent;
    private ArrayList<Node> children;
    private int value;
    private int nodeDepth;

    public Node(int value) {
        this.parent = null;
        this.children = new ArrayList<>();
        this.nodeDepth = 0;
        this.value = value;
    }

    public Node(int value, Node parent) {
        this.parent = parent;
        this.children = new ArrayList<>();
        this.nodeDepth = parent.getDepth()+1;
        this.value = value;
    }

    public static Node getInstance() {return null;}

    public void addChild(int v) {
        this.children.add(new Node(v, this));
    }

    public List<Node> getChildren() {return children.size()>0?children:null;}

    public Node getParent() {return parent;}

    public int getValue() {return value;};

    public static int minimax(Node startingNode, int depth, boolean isMaxingPlayer) {
        if ((startingNode.getDepth() == depth) || (startingNode.getChildren() == null)) {
            return startingNode.getValue();
        }
        int comparisonValue = isMaxingPlayer?Integer.MIN_VALUE:Integer.MAX_VALUE;
        int currentNodeValue;
        for (Node n: startingNode.getChildren()) {
            currentNodeValue = minimax(n, n.getDepth(), !isMaxingPlayer);
            if (isMaxingPlayer?(comparisonValue < currentNodeValue):(comparisonValue > currentNodeValue)) {
                comparisonValue = currentNodeValue;
            }
        }
        return comparisonValue;
    }

    public static int minimax(Node startingNode, boolean isMaxingPlayer) {
        return minimax(startingNode, Integer.MAX_VALUE, isMaxingPlayer);
    }

    private int getDepth() {
        return nodeDepth;
    }
}
