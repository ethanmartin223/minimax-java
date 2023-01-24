public class Main {
    public static void main(String[] args) {
        Node currentBoardState = new Node((int) (Math.random() * 100));
        System.out.println(currentBoardState.getValue());

        int f;
        for (int i = 0; i<3; i++) {
            f = (int) (Math.random() * 100);
            currentBoardState.addChild(f);
            System.out.print(f+"\t");
        }
        System.out.println();

        for (Node n: currentBoardState.getChildren()) {
            for (int i = 0; i<3; i++) {
                f = (int) (Math.random() * 100);
                n.addChild(f);
                System.out.print(f+" ");
            }
            System.out.print("\t");
        }
        System.out.println("\n");

        System.out.println(Node.minimax(currentBoardState, false));
    }
}
