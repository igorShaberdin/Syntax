package tasks08.tasks0815;

import java.util.Collection;
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

    public static void pairsInf(Map map) {
        int name = 0;
        int surname = 0;
        for (int i = 0; i < map.size(); i++) {
            surname = Collections.frequency(map.values(), i);
            if (surname > 0) {
                System.out.println(surname + " " + map.values());
            }
            name = Collections.frequency(map.keySet(), i);
            if (name > 0) {
                System.out.println(name + " " + map.keySet());
            }
        }
    }
}
//?