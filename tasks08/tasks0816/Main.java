package tasks08.tasks0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Date> map = new HashMap<>();
        createMap(map);
        removeSummer(map);
        System.out.println(map.entrySet());
    }
    public static HashMap<String, Date> createMap(HashMap<String, Date> map) {
        map.put("Name1", new Date ("MAY 23 1996"));
        map.put("Name2", new Date ("JUNE 23 1996"));
        map.put("Ivan", new Date ("APRIL 23 1996"));
        map.put("Name4", new Date ("SEPTEMBER 23 1996"));
        map.put("Name5", new Date ("MAY 23 1996"));
        map.put("Name6", new Date ("AUGUST 23 1996"));
        map.put("Name7", new Date ("MAY 23 1996"));
        return map;
    }
    public static HashMap<String, Date> removeSummer(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> entry = iterator.next();
            if(entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8) {
                iterator.remove();
            }
        }
        return map;
    }

}
