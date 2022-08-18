package task0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(console.readLine());
        }
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        System.arraycopy(array, 0, array1, 0, array1.length);
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[i + array2.length];
            System.out.println(array2[i]);
        }
        Address howMuch = new Address();
        howMuch.streetsAndHouses();

        ArrayList<String> line = new ArrayList<>();
        line.add("don't touch my straps");
        line.add("forget about it");
        line.add("you a nerd");
        line.add("please would be nice");
        line.add("you have a problem?");
        System.out.println(line.size());
        for(String i : line) {
            System.out.println(i);
        }

    }
}
