package tasks08.tasks0814;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
            set.removeIf(x -> x > 9);
        for(Integer s : set) {
            System.out.println(s);
        }
    }
}
