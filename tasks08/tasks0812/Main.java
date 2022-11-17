package tasks08.tasks0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        LinkedList<Integer> list = new LinkedList<>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(console.readLine()));
        }
        System.out.println(theSame(list));
    }

    public static String theSame(List list) {
        int max = Integer.MIN_VALUE;
        Object number = null;
        for (int i = 0; i < list.size() - 1; i++) {
            int a = Collections.frequency(list, list.get(i));
            if (a > max) {
                max = a;
            }
            if (max == a) {
                number = list.get(i);
            }
        }
        return max + "times is number " + number;
    }
}
