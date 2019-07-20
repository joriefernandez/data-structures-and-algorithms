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

    public HashSet<Edge> getEdges(){
        return this.edges;
    }

    public int getCost(Node<E> to){
        for(Edge ed: this.edges){
            if(ed.end.data.equals(to.data)){
                return ed.cost;
            }
        }
        return 0;
    }

    public String toString(){
        return data.toString();
    }
}
