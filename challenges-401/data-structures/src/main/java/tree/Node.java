package tree;

public class Node<E> {
    protected E data;
    protected Node<E> left;
    protected Node<E> right;

    //Constructors
    public Node (E data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node (E data,  Node<E> left,  Node<E> right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
