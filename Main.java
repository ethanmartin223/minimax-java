public class Main {
    public static void main(String[] args) {
        Node currentBoardState = new Node(97);

        for (int i = 0; i<3; i++) {
            currentBoardState.addChild((int) (Math.random() * 100));
            System.out.println((int) (Math.random() * 100));
        }

        for (Node n: currentBoardState.getChildren()) {
            for (int i = 0; i<3; i++) {
                n.addChild((int) (Math.random() * 100));
            }
        }
    }
}
