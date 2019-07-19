package graph;

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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


        assertEquals("Size of the edges on the source node should be updated", 1, newNode.edges.size());

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


    /****************************** BFS TEST ****************************************/

    @Test (expected = IllegalArgumentException.class)
    public void testBFSNullNode(){
        test = new Graph();
        test.breadthFirst(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testBFSNodeNotInGraph(){
        test = new Graph();
        Node<String> newNode = test.addNode("A");
        test.breadthFirst(new Node("B"));
    }

    @Test
    public void testBFSOneNeighbor(){
        test = new Graph();
        Node<String> newNode = test.addNode("A");
        Node<String> another = test.addNode("B");
        test.addEdge(newNode, another, 3);
        List<String> expected = new ArrayList<>();
        expected.add("A");
        expected.add("B");
        assertEquals("Should return the correct path", expected.toString(), test.breadthFirst(newNode).toString());
    }

    @Test
    public void testBFSNeighbors(){
        test = new Graph();
        Node<String> newNode = test.addNode("A");
        Node<String> another = test.addNode("B");
        Node<String> cNode = test.addNode("C");
        test.addEdge(newNode, another, 3);
        test.addEdge(another, cNode,20);
        List<String> expected = new ArrayList<>();
        expected.add("A");
        expected.add("B");
        expected.add("C");
        assertEquals("Should return the correct path", expected.toString(), test.breadthFirst(newNode).toString());
    }

    @Test
    public void testBFSNeighborsExample(){
        test = new Graph();
        Node<String> a = test.addNode("Pandora");
        Node<String> b = test.addNode("Arendelle");
        Node<String> c = test.addNode("Metroville");
        Node<String> d = test.addNode("Monstropolis");
        Node<String> e = test.addNode("Narnia");
        Node<String> f = test.addNode("Naboo");
        test.addEdge(a, b, 2);
        test.addEdge(b, c,2);
        test.addEdge(b, d,2);
        test.addEdge(c, e,2);
        test.addEdge(c, f,2);
        test.addEdge(c, d,2);
        test.addEdge(c, f,2);
        test.addEdge(d, b,2);
        test.addEdge(d, f,2);
        test.addEdge(d, c,2);
        List<String> expected = new ArrayList<>();
        expected.add("Pandora");
        expected.add("Arendelle");
        expected.add("Metroville");
        expected.add("Monstropolis");
        expected.add("Narnia");
        expected.add("Naboo");
        assertEquals("Should return the correct path", expected.toString(), test.breadthFirst(a).toString());
    }


    /****************************** DEPTH-FIRST TEST ****************************************/

    @Test (expected = IllegalArgumentException.class)
    public void testDepthFirstNullNode(){
        test = new Graph();
        test.depthFirst(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDepthFirstNodeNotInGraph(){
        test = new Graph();
        Node<String> newNode = test.addNode("A");
        test.depthFirst(new Node("B"));
    }

    @Test
    public void testDepthFirstOneNeighbor(){
        test = new Graph();
        Node<String> newNode = test.addNode("A");
        Node<String> another = test.addNode("B");
        test.addEdge(newNode, another, 3);
        List<String> expected = new ArrayList<>();
        expected.add("A");
        expected.add("B");
        assertEquals("Should return the correct path", expected.toString(), test.depthFirst(newNode).toString());
    }

    @Test
    public void testDepthNeighbors(){
        test = new Graph();
        Node<String> newNode = test.addNode("A");
        Node<String> another = test.addNode("B");
        Node<String> cNode = test.addNode("C");
        test.addEdge(newNode, another, 3);
        test.addEdge(another, cNode,20);
        List<String> expected = new ArrayList<>();
        expected.add("A");
        expected.add("B");
        expected.add("C");
        assertEquals("Should return the correct path", expected.toString(), test.depthFirst(newNode).toString());
    }

    @Test
    public void testDepthNeighborsExample(){
        test = new Graph();
        Node<String> a = test.addNode("Pandora");
        Node<String> b = test.addNode("Arendelle");
        Node<String> c = test.addNode("Metroville");
        Node<String> d = test.addNode("Monstropolis");
        Node<String> e = test.addNode("Narnia");
        Node<String> f = test.addNode("Naboo");
        test.addEdge(a, b, 2);
        test.addEdge(b, c,2);
        test.addEdge(b, d,2);
        test.addEdge(c, e,2);
        test.addEdge(c, f,2);
        test.addEdge(c, d,2);
        test.addEdge(c, f,2);
        test.addEdge(d, b,2);
        test.addEdge(d, f,2);
        test.addEdge(d, c,2);
        List<String> expected = new ArrayList<>();
        expected.add("Pandora");
        expected.add("Arendelle");
        expected.add("Monstropolis");
        expected.add("Metroville");
        expected.add("Narnia");
        expected.add("Naboo");
        assertEquals("Should return the correct path", expected.toString(), test.depthFirst(a).toString());
    }
}