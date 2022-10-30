package tasks07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = console.readLine()).equals("end")) {
            list.add(line);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
