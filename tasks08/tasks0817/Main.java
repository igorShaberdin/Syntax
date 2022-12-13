package tasks08.tasks0817;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Surname", "Name1");
        for (int i = 1; i < 5; i++) {
            map.put("Surname" + i, "Name" + i);
        }
        equalsTheValues(map);
        for (Map.Entry<String, String> print : map.entrySet()) {
            System.out.println(print.getKey() + " " + print.getValue());
        }
    }

    public static HashMap<String, String> equalsTheValues(HashMap<String, String> map) {
        List<String> list = new LinkedList<>(map.values());
        for (String s : list) {
            if (Collections.frequency(map.values(), s) > 1) {
                deleteTheSame(map, s);
            }
        }
        return map;
    }

    public static void deleteTheSame(HashMap<String, String> map, String line) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(line)) {
                map.remove(pair.getKey());
            }
        }
    }
}
