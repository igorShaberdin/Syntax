package tasks08.tasks0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Human p1 = new Human("n", 16, true);
        Human p2 = new Human("n", 20, false);
        Human p3 = new Human("n", 21, true);
        ArrayList<Human> list = new ArrayList<>(Arrays.asList(p1, p2, p3));
        Human father = new Human("f", true, 45, list);
        Human mother = new Human("m", false, 45, list);
        Human granpa = new Human("p", true, 65, new ArrayList<>(Collections.singletonList(father)));
        Human granma = new Human("m", false, 65, new ArrayList<>(Collections.singletonList(father)));
        Human granpa1 = new Human("p1", true, 65, new ArrayList<>(Collections.singletonList(mother)));
        Human granma1 = new Human("m1", false, 65, new ArrayList<>(Collections.singletonList(mother)));

        ArrayList<Human> list2 = new ArrayList<>(Arrays.asList(p1, p2, p3, father, mother, granma, granpa,
                granma1, granpa1));
        list2.forEach(System.out::println);
    }
}
