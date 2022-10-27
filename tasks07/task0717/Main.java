package tasks07.task0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(console.readLine());
        }
        doubleValues(list);
    }
    public static void doubleValues(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            words.add(i + 1, words.get(i++));
        }
        for (String s : words) {
            System.out.println(s);
        }
    }
}
