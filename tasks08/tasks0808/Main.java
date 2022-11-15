package tasks08.tasks0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        LinkedList list1 = new LinkedList();
        add1(list);
        set(list);
        get(list);
        remove(list);
        add1(list1);
        set(list1);
        get(list1);
        remove(list1);
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
