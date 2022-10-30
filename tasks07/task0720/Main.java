package tasks07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        System.out.println("inter two numbers");
        int n = Integer.parseInt(console.readLine());
        int m = Integer.parseInt(console.readLine());
        System.out.println("inter words");
        for (int i = 0; i < n; i++) {
            list.add(console.readLine());
        }
        for (int i = 0; i < m; i++) {
            list.add(list.size()-1, list.remove(0));
        }
        for (String i : list) {
            System.out.println(i);
        }
    }
}
//
