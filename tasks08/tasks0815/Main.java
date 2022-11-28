package tasks08.tasks0815;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Николай");
        map.put("Петров", "Андрей");
        map.put("Петров", "Влад");
        map.put("Шебекин", "Влад");
        pairsInf(map);
    }

    public static void pairsInf(HashMap<String, String> map) {
        int name = 1;
        int surname = 1;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            name = Collections.frequency(map.values(), pair.getValue());
                if (name > 1) {
                    System.out.println(name + " " + pair.getValue());
                }
                surname = Collections.frequency(map.keySet(), pair.getKey());
                if (surname > 1) {
                    System.out.println(surname + " " + pair.getKey());
                }
        }
    }
}
