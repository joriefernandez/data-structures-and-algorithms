package treeintersection;

import java.util.*;

/**
 *  Class to determine values of both trees
 */

public class TreeIntersection {

    private HashSet<Integer> values = new HashSet<>();

    //Tree class
    protected static class Tree {

        //overall root
        Node overallRoot;

        protected static class Node {
            protected int data;
            protected Node left;
            protected Node right;

            public Node (int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }


            public Node(int data, Node left, Node right) {
                this.data = data;
                this.left = left;
                this.right = right;
            }
        }

        public Tree(){
            this.overallRoot = null;
        }

        public Tree(Node root){
            this.overallRoot = root;
        }
    }


    /**
     * Method to determine values that are in both trees
     * @param input1 first tree
     * @param input2 second tree
     * @return set of values in both trees
     */
    public HashSet<Integer> treeIntersection(Tree input1, Tree input2){

        HashSet<Integer> result = new HashSet<>();

        if(input1.overallRoot == null || input2.overallRoot == null){
            return result;
        }

        //Store the values of first tree in a hashset
        values = new HashSet<>();
        createSet(input1.overallRoot);


        Queue nodes = new LinkedList();
        nodes.offer(input2.overallRoot);

        while (!nodes.isEmpty()) {
            Tree.Node currentNode = (Tree.Node) nodes.poll();
            //Check if the current item in second tree is in the first tree
            // If true, add to the result set
            if(values.contains(currentNode.data)) {
                result.add(currentNode.data);
            }
            //Put left and right children to the queue
            if (currentNode.left != null) {
                nodes.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                nodes.offer(currentNode.right);
            }
        }

        return result;

    }

    //Helper method to add values of a tree in a HashSet
    private void createSet(Tree.Node root){
        if(root != null) {
            values.add(root.data);
            createSet(root.left);
            createSet(root.right);
        }
    }


}
