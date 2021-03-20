public class Node {
    private Node leftChild;
    private Node rightChild;
    private final Coin coin;

    public Node(Coin coin) {
        this.coin = coin;
    }

    public Node(Node leftChild, Node rightChild, Coin coin) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.coin = coin;
    }

    public boolean equals(Node b) {
        return this.getCoin().equals(b.getCoin());
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Coin getCoin() {
        return coin;
    }
}
