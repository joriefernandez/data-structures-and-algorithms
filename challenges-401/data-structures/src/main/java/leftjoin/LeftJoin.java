package leftjoin;

import java.util.HashMap;
import java.util.Map;

public class LeftJoin {

    Map<String, String[]> result =  new HashMap<>();

    public Map<String, String[]> leftJoin(HashMap<String, String> firstMap,
                                                      HashMap<String, String> secondMap){
        if(firstMap != null) {
            putMap(firstMap);

            secondMap.forEach((key, value) -> {
                String curKey = key.toLowerCase();
                if (result.containsKey(curKey)) {
                    String[] values = result.get(curKey);
                    if (value != null) {
                        values[1] = value.toLowerCase();
                    }
                    result.put(key, values);
                }
            });
        }
        return result;


    }

    //helper method
    private void putMap(HashMap<String, String> input ){

        input.forEach((key, value) -> {
            if(value != null){
                String[] values = new String[2];
                values[0] = value.toLowerCase();
                result.put(key.toLowerCase(), values);
            } else{
                result.put(key.toLowerCase(), new String[2]);
            }
        });



    }
}
