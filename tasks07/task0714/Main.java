package tasks07.task0714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            words.add(console.readLine());
        }
        words.remove(2);
        for(int i = words.size(); i > 0; i--) {
            System.out.println(words.get(i-1));
        }
    }
}
