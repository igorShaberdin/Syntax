package tasks08.tasks0817;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Name0", "Surname0");
        for (int i = 0; i < 5; i++) {
            map.put("Name" + i, "Surname" + i);
        }
        for (Map.Entry<String, String> print : map.entrySet()) {
            System.out.println(print.getKey() + " " + print.getValue());
        }
    }

    public static HashMap<String, String> deleteTheSame(HashMap<String, String> map) {
        List<String> list = new LinkedList<>(map.values());
        for(String s : list) {
            if (Collections.frequency(map.values(), s) > 1) {
                map.remove(s);
            }
        }
        return map;
    }
}
