package graph;

public class Edge {

    Node start;
    Node end;
    int cost;

    public Edge (Node start, Node  end){
        this.start = start;
        this.end = end;
        this.cost = 0;
    }

    public Edge (Node start, Node end, int cost){
        this.start = start;
        this.end = end;
        this.cost = cost;
    }
}
