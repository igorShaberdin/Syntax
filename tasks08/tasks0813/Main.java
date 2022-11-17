package tasks08.tasks0813;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(makeSet(set));
    }
    public static Set<String> makeSet(Set set) {
        for(int i = 0; i < 20; i++) {
            set.add("Л" + i);
        }
        return set;
    }
}
