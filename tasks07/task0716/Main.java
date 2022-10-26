package tasks07.task0716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            words.add(console.readLine());
        }
        fix(words);
    }

    static void fix(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).contains("р") && words.get(i).contains("л")) {
                continue;
            }
            if (words.get(i).contains("р")) {
                words.remove(i);
                i--;
            } else if (words.get(i).contains("л")) {
                words.add(i+1, words.get(i++));
            }
        }
        for (String print : words) {
            System.out.println(print);
        }
    }
}

