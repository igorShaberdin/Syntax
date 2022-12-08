package tasks08.tasks0816;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Name" + i, i);
        }
        mapDeleteEven(map);
        map.entrySet().forEach(print -> {
            System.out.println(print.getKey() + " " + print.getValue());
        });
    }

    public static HashMap<String, Integer> mapDeleteEven(HashMap map) {
        Iterator<Map.Entry<String, Integer>> entry = map.entrySet().iterator();
        while(entry.hasNext()) {
            Map.Entry<String, Integer> iter = entry.next();
            if(iter.getValue() % 2 == 0) {
                entry.remove();
            }
        }
        return map;
    }
}
