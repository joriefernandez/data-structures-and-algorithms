package graph;

import java.util.HashSet;

public class Node<E> {
    E data;
    HashSet<Edge> edges;

    public Node(E data){
        this.data = data;
        this.edges = new HashSet<>();
    }

    public void addNodeEdge(Edge edge){
        edges.add(edge);
    }

    public String toString(){
        return data.toString();
    }
}
