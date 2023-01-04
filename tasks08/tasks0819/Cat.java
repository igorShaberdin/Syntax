package tasks08.tasks0819;

import java.util.HashSet;
import java.util.Set;

public class Cat {
    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            set.add(new Cat());
        }
        return set;
    }

    public static void printCat(Set<Cat> list) {
        for (Cat s : list) {
            System.out.println(s);
        }
    }
}
