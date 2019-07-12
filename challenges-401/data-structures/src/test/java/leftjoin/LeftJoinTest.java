package leftjoin;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class LeftJoinTest {

    private LeftJoin test;
    private HashMap<String, String> first;
    private HashMap<String, String> second;
    private Map<String, String[]> expected;

    @Before
    public void init(){
        LeftJoin test = new LeftJoin();
        first = new HashMap<>();
        second = new HashMap<>();
        expected = new HashMap<String, String[]>();
    }


    @Test
    public void testLeftJoin(){
        test = new LeftJoin();
        first = new HashMap<>();
        first.put("big", "huge");

        second = new HashMap<>();
        second.put("big", "small");

        String[] vals = new String[]{"huge", "small"};
        expected = new HashMap<String, String[]>();
        expected.put("big", new String[]{"huge", "small"});

        Map<String, String[]> res = new HashMap<>();
        res = test.leftJoin(first, second);
        assertEquals("Keys should be the same", expected.keySet(), res.keySet());
        assertTrue(areEqualWithArrayValue(expected, res));


    }

    @Test
    public void testLeftJoinWithNull(){
        test = new LeftJoin();
        first = new HashMap<>();
        first.put("big", "huge");
        first.put("calm", "tranquil");

        second = new HashMap<>();
        second.put("big", "small");
        second.put("calm", null);

        String[] vals = new String[]{"huge", "small"};
        expected = new HashMap<String, String[]>();
        expected.put("big", new String[]{"huge", "small"});
        expected.put("calm", new String[]{"tranquil", null});

        Map<String, String[]> res = new HashMap<>();
        res = test.leftJoin(first, second);
        assertEquals("Keys should be the same", expected.keySet(), res.keySet());
        assertTrue(areEqualWithArrayValue(expected, res));


    }

    @Test
    public void testLeftJoinWithNullSecondHash(){
        test = new LeftJoin();
        first = new HashMap<>();
        first.put("big", "huge");
        first.put("calm", "tranquil");

        String[] vals = new String[]{"huge", "small"};
        expected = new HashMap<String, String[]>();
        expected.put("big", new String[]{"huge", null});
        expected.put("calm", new String[]{"tranquil", null});

        Map<String, String[]> res = new HashMap<>();
        res = test.leftJoin(first, second);
        assertEquals("Keys should be the same", expected.keySet(), res.keySet());
        assertTrue(areEqualWithArrayValue(expected, res));

    }

    @Test
    public void testLeftJoinWithNullFirstHash(){
        test = new LeftJoin();

        second = new HashMap<>();
        second.put("big", "small");
        second.put("calm", null);


        String[] vals = new String[]{"huge", "small"};
        expected = new HashMap<String, String[]>();

        Map<String, String[]> res = new HashMap<>();
        res = test.leftJoin(null, second);
        assertEquals("Keys should be the same", expected.keySet(), res.keySet());
        assertTrue(areEqualWithArrayValue(expected, res));

    }




    //Helper to check array valuesßß∂ from : https://www.baeldung.com/java-compare-hashmaps
    private boolean areEqualWithArrayValue(Map<String, String[]> first, Map<String, String[]> second) {
        if (first.size() != second.size()) {
            return false;
        }

        return first.entrySet().stream()
                .allMatch(e -> Arrays.equals(e.getValue(), second.get(e.getKey())));
    }

}