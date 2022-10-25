package tasks07.task0705;

import java.util.ArrayList;
import java.util.Arrays;

public class smallestList {
    public void theAnswer() {
        ArrayList<String> line = new ArrayList<>(Arrays.asList("don't touch my straps", "you a nerd", "forget about it"));
        int smallest = line.indexOf(0);
        int index = 0;
        for (int i = 0; i < line.size(); i++) {
            if(line.get(i).length() < smallest) {
                smallest = line.get(i).length();
                index = i;
            }
        }
        System.out.printf("smallest: %s, index: %s, line: ", smallest, index, line.get(index));
    }
}
