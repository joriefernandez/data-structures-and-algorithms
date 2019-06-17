package tree;

/**
 *
 * Use comparable to use compareTo method to compare objects
 * results to 1 if object is greater
 *  -1 if less than and 0 if equal.
 *
 *  Reference: https://canvas.uw.edu/courses/1070026/files/folder/lectures/day08_bst?preview=38603832
 */

public class BinarySearchTree<E extends Comparable<? super E>> extends Tree<E> {
    Node<E> overallRoot;

    //Constructors
    public BinarySearchTree(){
        this.overallRoot = null;
    }

    public BinarySearchTree(Node root){
        this.overallRoot = root;
    }


    //Add node to the tree
    public void add(E data){
        overallRoot = add(overallRoot, data);
    }

    public boolean contains (E value){
        if(overallRoot == null){
            System.out.println("Tree is null");
            return false;
        }
        return contains(overallRoot, value);
    }

    //Helper for adding node
    private Node<E> add(Node<E> root, E value){
        if(root == null){
            root =  new Node<E>(value);
        } else{
            int compare = value.compareTo(root.data);
            if(compare > 0){
                root.right = add(root.right, value);
            } else if(compare < 0){
                root.left = add(root.left, value);
            }

        }

        return root;
    }

    //Helper method for contains
    private boolean contains(Node<E> root, E value){
        if(root == null){
            return false;
        } else{
            int compare =  value.compareTo(root.data);
            if(compare == 0){
                return true;
            } else if(compare < 0){
                return contains(root.left, value);
            } else{
                return contains(root.right, value);
            }
        }
    }

}
