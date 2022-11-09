package tasks07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        String line;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        while (!(line = console.readLine()).isEmpty()) {
            list.add(line);
        }
        for(String print : list) {
            System.out.println(print.toUpperCase());
        }
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length()%2 == 0) {
                list2.add(i, (s + " " + s));
            }
            else {
                list2.add(i, (s + " " + s + " " + s));
            }
        }
        for (String print : list2) {
            System.out.println(print);
        }
    }
}
