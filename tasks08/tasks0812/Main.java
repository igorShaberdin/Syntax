package tasks08.tasks0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> list = new LinkedList<>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(i, Integer.parseInt(console.readLine()));
        }
        int max = Integer.MIN_VALUE;
        for (Integer i : list) {
            int a = Collections.frequency(list, list.get(i));
            if (a > max) {
                max = a;
            }
            else if (max == a) {
                System.out.println(max + " is " + list.get(i));
            }
        }
    }
}
