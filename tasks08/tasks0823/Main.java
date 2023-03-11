package tasks08.tasks0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        toUpperCase();
    }

    public static void toUpperCase() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String a = reader.readLine();
        for (String word : a.split("\\b")) {
            System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1));
        }
    }
}
