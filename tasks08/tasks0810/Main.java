package tasks08.tasks0810;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list1 = new ArrayList();
        LinkedList<Object> list2 = new LinkedList<>();
        add(list1);
        System.out.println(getTime(list1));
        add(list2);
        System.out.println(getTime(list2));
    }

    public static List add(List list) {
        for(int i = 0; i < 10000; i++) {
            list.add(i);
        }
        return list;
    }
    public static long getTime(List list) {
        long startTime = new Date().getTime();
        getList(list);
        return new Date().getTime() - startTime;
    }
    public static List getList(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
        return list;
    }
}
