package tasks08.tasks0801;

import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, "арбуз", "банан", "вишня", "груша", "дыня",
                "ежевика", "жень-шень", "земляника", "ирис", "картофель");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
