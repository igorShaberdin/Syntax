package tasks08.tasks0804;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"dogs", "hex", "mix", "cats", "fox",
                "drinks", "rocky"};
        HashMap<String, Integer> map = addToMap(array);
        printMap(map);
    }
    private static HashMap<String, Integer> addToMap(String[] array) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        return map;
    }
    private static void printMap(HashMap<String, Integer> map) {
        for(String s : map.keySet()) {
            System.out.println(s);
        }
    }
}
