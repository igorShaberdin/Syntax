package tasks07.task0711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            list.add(console.readLine());
        }
        for(int i = 0; i < 13; i++) {
            list.add(0, list.remove(list.size()-1));
        }
        for(String s : list) {
            System.out.println(s);
        }
    }
}
