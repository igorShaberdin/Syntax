package tasks07.task0726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input name");
        String name = console.readLine();
        System.out.println("input age");
        int age = Integer.parseInt(console.readLine());
        System.out.println("input weight");
        int weight = Integer.parseInt(console.readLine());
        System.out.println("input tail");
        int tail = Integer.parseInt(console.readLine());
        Cats cat1 = new Cats();
    }
}
