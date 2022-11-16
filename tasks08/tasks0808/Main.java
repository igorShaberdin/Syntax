package tasks08.tasks0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        LinkedList list1 = new LinkedList();
        long startTime1 = System.currentTimeMillis();
        add1(list);
        long finishTime1 = System.currentTimeMillis();
        set(list);
        get(list);
        remove(list);
        long startTime2 = System.currentTimeMillis();
        add1(list1);
        long finishTime2 = System.currentTimeMillis();
        set(list1);
        get(list1);
        remove(list1);
        long time1 = finishTime1 - startTime1;
        long time2 = finishTime2 - startTime2;
        System.out.printf("time arrayList is %s, time linkedList is %s",
                time1, time2);
    }

    public static void add1(List list) {
        for (int i = 0, s = 1; i < 10000; i++) {
            list.add(i, s++);
        }
    }

    public static void remove(List list) {
        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }
    }

    public static void set(List list) {
        for (int i = 0; i < 10000; i++) {
            list.set(i, list.get(i));
        }
    }

    public static void get(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }
}
