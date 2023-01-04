package tasks08.tasks0821;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            map.put("Surname" + i, "Name" + i);
        }
        map.put("Surname" + 8, "Name" + 8);
        for(Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s);
        }
    }
}
