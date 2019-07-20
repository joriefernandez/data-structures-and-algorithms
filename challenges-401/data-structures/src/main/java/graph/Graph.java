package graph;


import java.util.*;

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

            Edge otherEdge = new Edge(dest, src, cost);
            nodes.get(dest).add(src);
            dest.addNodeEdge(otherEdge);


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


    /**
     * Method for breadth-first traversal
     * @param start starting node
     * @return path from the starting node
     */
    public List<Node<E>> breadthFirst(Node<E> start){

        //set that will contain visited nodes
        HashSet<Node<E>> visited = new HashSet<>();

        // resulting nodes
        List<Node<E>> result = new ArrayList<>();

        //queue for traversal
        Queue<Node<E>> nodeList = new LinkedList<>();
        //check if the node exists in the graph

        if(start == null){
            throw new IllegalArgumentException("Node cannot be null");
        }

        if(nodes.containsKey(start)){
            nodeList.add(start);
            visited.add(start);
            result.add(start);
        } else{
            throw new IllegalArgumentException("Node is not in the graph");
        }

        //traverse through the queue
        while(!nodeList.isEmpty()){
            Node<E> curNode = nodeList.poll();

            //check if the node has been visited, if not add to the result
            if(!visited.contains(curNode)){
                result.add(curNode);
            }

            //add the node to visited
            visited.add(curNode);
            //get all the neighbors of the node and add to the queue
            nodes.get(curNode).forEach( neighbor -> {
                if(!visited.contains(neighbor)) {
                    nodeList.add(neighbor);
                }
            });

        }

        return result;
    }


    /**
     * Method for depth-first traversal of graph
     * @param start starting node
     * @return path from the starting node
     */
    public List<Node<E>> depthFirst(Node<E> start){

        //set that will contain visited nodes
        HashSet<Node<E>> visited = new HashSet<>();

        // resulting nodes
        List<Node<E>> result = new ArrayList<>();

        //stack for traversal
        Stack<Node<E>> nodeList = new Stack<>();
        //check if the node exists in the graph

        if(start == null){
            throw new IllegalArgumentException("Node cannot be null");
        }

        if(nodes.containsKey(start)){
            nodeList.push(start);
            visited.add(start);
            result.add(start);
        } else{
            throw new IllegalArgumentException("Node is not in the graph");
        }

        //traverse through the queue
        while(!nodeList.isEmpty()){
            Node<E> curNode = nodeList.pop();

            //check if the node has been visited, if not add to the result
            if(!visited.contains(curNode)){
                result.add(curNode);
            }

            //add the node to visited
            visited.add(curNode);
            //get all the neighbors of the node and add to the stack
            nodes.get(curNode).forEach( neighbor -> {
                if(!visited.contains(neighbor)) {
                    nodeList.push(neighbor);
                }
            });

        }

        return result;
    }

    //get node based from value
    public Node<E> getPresentNode(E data){
        for(Node<E> node: nodes.keySet()){
            if(node.data.equals(data)){
                return node;
            }
        }
        return null;
    }






}

