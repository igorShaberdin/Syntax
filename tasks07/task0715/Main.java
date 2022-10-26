package tasks07.task0715;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, "мама", "мыла", "раму");

        for (int i = 1; i < 4; i++) {
            if (i % 2 != 0) {
                words.add(i, "именно");
            }
        }

        for (String print : words) {
            System.out.println(print);
        }
    }
}
