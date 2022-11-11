package tasks08.tasks0803;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"васька", "мурка", "дымка", "рыжик",
                "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        HashMap<String, Cat> map = addToMap (array);
    }

    private static HashMap<String, Cat> addToMap(String[] array) {
        HashMap<String, Cat> map = new HashMap<>();
        for(String cat : array) {
            map.put(cat, new Cat(cat));
        }
        return map;
    }
}
