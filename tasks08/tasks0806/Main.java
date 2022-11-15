package tasks08.tasks0806;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"Go", "To", "coding",
        "4r2", "input", "word", "fox", "all"};
        HashMap<String, Object> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        printMap(map);
    }
    private static void printMap(HashMap<String, Object> map) {
        for(Map.Entry<String, Object> s : map.entrySet()) {
            System.out.println(s);
        }
    }
}
