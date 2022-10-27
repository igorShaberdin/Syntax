package tasks07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("inter two numbers");
        int n = Integer.parseInt(console.readLine());
        int m = Integer.parseInt(console.readLine());
        System.out.println("inter words");
        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(console.readLine()));
        }
        for (int i = 0, a = list.size(); i < m; i++, a--) {

        }
    }
}
