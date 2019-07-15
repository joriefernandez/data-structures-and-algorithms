package graph;

import org.junit.Before;
import org.junit.Test;


import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GraphTest {

    private Graph test;

    @Before
    public void init(){
        Graph test = new Graph();
    }

    @Test
    public void addNode() {
        test = new Graph();

        Node<String> newNode = test.addNode("A");
        assertEquals("Graph size should be the same", 1, test.size());

        Node<String> another = test.addNode("B");
        assertEquals("Graph size should be the same", 2, test.size());

    }

    @Test
    public void addEdge() {
        test = new Graph();
        Node<String> newNode = test.addNode("A");
        Node<String> another = test.addNode("B");
        test.addEdge(newNode, another, 3);
        assertEquals("Size of the edges on the source node should be updated", 1, newNode.edges.size());

    }

    @Test
    public void getNodes() {
        test = new Graph();
        Node<String> newNode = test.addNode("A");
        Node<String> another = test.addNode("B");
        HashSet<Node<String>> expected = new HashSet<>();
        expected.add(newNode);
        expected.add(another);
        assertEquals("Graph size should be the same", 2, test.getNodes().size());
        assertEquals("Graph keys should be the same", expected.toString(), test.getNodes().toString());
    }

    @Test
    public void getNeighbors() {
        test = new Graph();
        Node<String> newNode = test.addNode("A");
        Node<String> another = test.addNode("B");
        test.addEdge(newNode, another, 3);
        HashSet<Node<String>> expected = new HashSet<>();
        expected.add(another);

        assertEquals("Should return the neighbors", expected, test.getNeighbors(newNode));

    }

    @Test
    public void addEdgeWeight() {
        test = new Graph();
        Node<String> newNode = test.addNode("A");
        Node<String> another = test.addNode("B");
        test.addEdge(newNode, another, 3);

        assertEquals("Size of the edges on the source node should be updated", 1, newNode.edges);

    }


    @Test
    public void size() {
        test = new Graph();

        Node<String> newNode = test.addNode("A");
        assertEquals("Graph size should be the same", 1, test.size());
    }

    @Test
    public void addOneNodeOneEdge() {
        test = new Graph();

        Node<String> newNode = test.addNode("A");
        test.addEdge(newNode, null, 3);
        assertEquals("Graph size should be the same", 1, test.size());
        assertEquals("Size of the edges on the source node should be updated", 0, newNode.edges.size());

    }

    @Test
    public void graphConstructor() {
        test = new Graph();
        assertEquals(new HashMap<>(), test.nodes);
    }
}