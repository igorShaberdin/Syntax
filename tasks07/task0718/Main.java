package tasks07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = new ArrayList<>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++) {
            words.add(console.readLine());
        }
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > words.get(i+1).length()) {
             System.out.println(words.get(i+1));
             break;
            }
        }
    }
}
