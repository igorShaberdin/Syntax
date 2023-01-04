package tasks08.tasks0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        getIntegerList(list);
        System.out.println(getMinimum(list));
    }

    public static ArrayList getIntegerList(ArrayList<Integer> list) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(console.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(console.readLine()));
        }
        return list;
    }

    public static int getMinimum(ArrayList<Integer> list) {
        Collections.sort(list);
        return list.get(0);
    }
}
