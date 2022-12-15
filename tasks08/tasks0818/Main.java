package tasks08.tasks0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Surname" + i, 495 + i);
        }
        //map.values().removeIf(number -> number < 500);
        //Iter.deleteLess500(map);
        equalsValue(map);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static HashMap<String, Integer> equalsValue(HashMap<String, Integer> map) {
        List<Integer> list = new ArrayList<>(map.values());
        for (Integer value : list) {
            if (value < 500) {
                deleteTheKey(map, value);
            }
        }
        return map;
    }

    public static void deleteTheKey(HashMap<String, Integer> map, Integer value) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> s : copy.entrySet()) {
            if (s.getValue().equals(value)) {
                map.remove(s.getKey());
            }
        }
    }
}
