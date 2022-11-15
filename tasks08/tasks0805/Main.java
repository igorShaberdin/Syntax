package tasks08.tasks0805;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Togo1", 1);
        map.put("Togo2", 2);
        map.put("Togo3", 3);
        map.put("Togo4", 4);
        map.put("Togo5", 5);
        map.put("Togo6", 6);
        map.put("Togo7", 7);
        map.put("Togo8", 8);
        map.put("Togo9", 9);
        map.put("Togo10", 10);
        printMap(map);
    }
    private static void printMap(HashMap<String, Integer> map) {
        for(Integer s : map.values()) {
            System.out.println(s);
        }
    }
}
