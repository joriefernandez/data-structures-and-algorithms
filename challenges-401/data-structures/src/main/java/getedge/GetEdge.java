package getedge;

import graph.Edge;
import graph.Graph;
import graph.Node;
import java.util.Set;

public class GetEdge {

    //Class that will contain values if there is a direct path and the total cost
    public static class DirectPath{
        boolean isTrue;
        int  cost;

        public DirectPath(){
            this.isTrue = false;
            this.cost = 0;
        }

        public DirectPath(int cost){
            this.isTrue = true;
            this.cost = cost;
        }
    }

    /**
     * Method to return if there is a direct edge in the graph
     * @param graph
     * @param cities string array
     * @return DirectPath object that contains true if there is a direct path and corresponding cost
     */
    public static DirectPath getEdge(Graph graph, String[] cities){
        int total = 0;

        //check if invalid, return false and 0
        if(graph == null || cities == null){
            return new DirectPath();
        }

        //loop through the array and check if the graph contains the node
        for(int index = 0; index < cities.length-1; index++){
            //get the corresponding node
            Node curNode = graph.getPresentNode(cities[index]);
            //get neighbors of the current node
            Set<Edge> edges = graph.getNeighbors(curNode);
            // get the node of the next item in the array
            Node next = graph.getPresentNode(cities[index+1]);
            //check if the next node is in the list of edges, if so get the corresponding cost
            // if not return false and 0 cost
            if(edges.contains(graph.getPresentNode(cities[index+ 1]))){
                total += curNode.getCost(next);
            }else{
                return new DirectPath();
            }

        }

        return new DirectPath(total);

    }
}
