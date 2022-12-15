package tasks08.tasks0818;

import java.util.HashMap;
import java.util.Iterator;

public class Iter {
    public static void deleteLess500(HashMap<String, Integer> map) {
        Iterator<Integer> iter = map.values().iterator();
        while (iter.hasNext()) {
            if (iter.next() < 500) {
                iter.remove();
            }
        }
    }
}
