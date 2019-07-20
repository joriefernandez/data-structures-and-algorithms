package getedge;

import graph.Graph;
import graph.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {

    private Graph graph;

    @Test
    public void getEdge() {
        init();

        String[] cities = new String[]{"Metroville", "Pandora"};
        GetEdge.DirectPath result = GetEdge.getEdge(graph, cities);

        assertTrue("Should be the same result", result.isTrue);
        assertEquals("Should be the same result", 82, result.cost);

    }

    @Test
    public void getEdge3Cities() {
        init();

        String[] cities = new String[]{"Arendelle", "Monstropolis", "Naboo"};
        GetEdge.DirectPath result = GetEdge.getEdge(graph, cities);

        assertTrue("Should be the same result", result.isTrue);
        assertEquals("Should be the same result", 115, result.cost);

    }

    @Test
    public void getEdgeFalse2Cities() {
        init();

        String[] cities = new String[]{"Naboo", "Pandora"};
        GetEdge.DirectPath result = GetEdge.getEdge(graph, cities);

        assertFalse("Should be the same result", result.isTrue);
        assertEquals("Should be the same result", 0, result.cost);

    }

    @Test
    public void getEdgeFalse3Cities() {
        init();

        String[] cities = new String[]{"Narnia", "Arendelle", "Naboo"};
        GetEdge.DirectPath result = GetEdge.getEdge(graph, cities);

        assertFalse("Should be the same result", result.isTrue);
        assertEquals("Should be the same result", 0, result.cost);

    }

    @Test
    public void testNullGraph(){

        String[] cities = new String[]{"Narnia", "Arendelle", "Naboo"};
        GetEdge.DirectPath result = GetEdge.getEdge(null, cities);

        assertFalse("Should be the same result", result.isTrue);
        assertEquals("Should be the same result", 0, result.cost);

    }

    @Test
    public void testEmptyString(){
        init();

        GetEdge.DirectPath result = GetEdge.getEdge(graph, null);

        assertFalse("Should be the same result", result.isTrue);
        assertEquals("Should be the same result", 0, result.cost);

    }

    private void init(){
        graph = new Graph();
        Node<String> pandora = graph.addNode("Pandora");
        Node<String> metroville = graph.addNode("Metroville");
        Node<String> arendelle = graph.addNode("Arendelle");
        Node<String> monstropolis = graph.addNode("Monstropolis");
        Node<String> naboo = graph.addNode("Naboo");
        Node<String> narnia = graph.addNode("Narnia");
        graph.addEdge(pandora, arendelle, 150);
        graph.addEdge(pandora, metroville, 82);
        graph.addEdge(arendelle, metroville, 99);
        graph.addEdge(arendelle, monstropolis, 42);
        graph.addEdge(metroville, narnia, 37);
        graph.addEdge(metroville, naboo, 26);
        graph.addEdge(metroville, monstropolis, 105);
        graph.addEdge(narnia, naboo, 250);
        graph.addEdge(naboo, monstropolis, 73);
    }
}