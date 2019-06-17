package tree;

import java.util.ArrayList;

public class Tree<E> {

    //overall root
    Node<E> overallRoot;

    //ordered value list
    ArrayList<E> values;


    //Tree node class
    protected static class Node <E>{
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


}
