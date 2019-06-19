package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import tree.Node;

public class Tree<E> {

    //overall root
    Node<E> overallRoot;

    //ordered value list
    ArrayList<E> values;

    
    //Tree constructor
    public Tree(){
        this.overallRoot = null;
    }

    public Tree(Node root){
        this.overallRoot = root;
    }

    //preorder traversal
    public ArrayList<E> preOrder(){
        values = new ArrayList<E>();
        return preOrder(overallRoot);
    }

    //Inorder traversal
    public ArrayList<E> inOrder(){
        values = new ArrayList<>();
        return inOrder(overallRoot);
    }

    //postOrder traversal
    public ArrayList<E> postOrder(){
        values = new ArrayList<>();
        return postOrder(overallRoot);
    }

    //Breadth-first traversal
    public ArrayList<E> breadthFirst(){
        values = new ArrayList<>();

        if(overallRoot != null) {

            Queue nodes = new LinkedList();
            nodes.offer(overallRoot);

            while (!nodes.isEmpty()) {
                Node<E> currentNode = (Node<E>) nodes.poll();
                values.add(currentNode.data);
                if (currentNode.left != null) {
                    nodes.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    nodes.offer(currentNode.right);
                }

            }
        }

        return values;
    }

    //Helper for pre-order traversal
    private ArrayList<E> preOrder(Node<E> root){
        if(root == null){
            return null;
        }

        values.add(root.data);
        preOrder(root.left);
        preOrder(root.right);

        return values;
    }

    //Helper for inorder traversal
    private ArrayList<E> inOrder(Node<E> root){
        if(root == null){
            return null;
        }

        inOrder(root.left);
        values.add(root.data);
        inOrder(root.right);

        return values;

    }

    //Helper for post-order traversal
    private ArrayList<E> postOrder(Node<E> root){
        if(root == null){
            return null;
        }

        postOrder(root.left);
        postOrder(root.right);
        values.add((E) root.data);
        return values;

    }


    public Node<E> getOverallRoot(){
        return this.overallRoot;
    }


}
