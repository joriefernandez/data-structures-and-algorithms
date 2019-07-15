package graph;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph<E> {

    HashMap<Node<E>, HashSet<Node<E>>> nodes;

    public Graph(){
        this.nodes = new HashMap<>();
    }


    /**
     * Method to add node to the graph
     * @param value of the node
     */
    public Node<E> addNode(E value){
        Node<E> newNode = new Node<>(value);
        if(value != null){
            nodes.putIfAbsent(newNode, new HashSet<>());
        }
        return newNode;
    }

    /**
     * Method to add edge to a node
     * @param src starting node
     * @param dest end node
     * @param cost weight associated to the edge
     */
    public void addEdge(Node src, Node dest, int cost){
        if(nodes.containsKey(src) && nodes.containsKey(dest)){
            Edge newEdge = new Edge(src, dest, cost);
            nodes.get(src).add(dest);
            src.addNodeEdge(newEdge);

        }

    }

    /**
     * Method to return all nodes in the graph
     * @return nodes in the graph
     */
    public Set<Node<E>> getNodes(){
        return nodes.keySet();
    }

    /**
     * Method to return neighbors
     * @param node search key
     * @return set of neighbor nodes
     */
    public  Set<Node<E>> getNeighbors(Node<E> node){
        Set<Node<E>> result = new HashSet<>();
        result = nodes.get(node);
        return result;
    }

    /**
     * Method to return the total number of nodes in the graph
     * @return size number
     */
    public int size(){
        return nodes.size();
    }






}

