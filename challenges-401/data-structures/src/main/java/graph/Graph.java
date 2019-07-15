package graph;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph<E> {

    private HashMap<Node<E>, HashSet<Node<E>>> nodes;

    public Graph(){
        this.nodes = new HashMap<>();
    }

    class Node<E> {
        E data;
        HashSet<Edge> edges;

        public Node (E data){
            this.data = data;
            this.edges = new HashSet<>();
        }

    }

    class Edge<E>{

        Node<E> start;
        Node<E> end;
        int cost;

        public Edge (Node<E> start, Node<E> end){
            this.start = start;
            this.end = end;
            this.cost = 0;
        }

        public Edge (Node<E> start, Node<E> end, int cost){
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

    }

    /**
     * Method to add node to the graph
     * @param value of the node
     */
    public void addNode(E value){
        if(value != null){
            nodes.putIfAbsent(new Node<E>(value), new HashSet<>());
        }
    }

    /**
     * Method to add edge to a node
     * @param src starting node
     * @param dest end node
     * @param cost weight associated to the edge
     */
    public void addEdge(Node<E> src, Node<E> dest, int cost){
        if(nodes.containsKey(src) && nodes.containsKey(dest)){
            Edge<E> newEdge = new Edge<>(src, dest, cost);
            src.edges.add(newEdge);
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

