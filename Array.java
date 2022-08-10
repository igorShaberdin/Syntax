import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class Array {
    public int[] initializeArray() {
        int[] array = new int[10];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
            }
        return array;
}

    public int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;
    }
    public int max(int[] array) {
        int max = MIN_VALUE;
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public void arrays() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] length = new int[10];
        String[] strings = new String[10];
        for(int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
        }
        for (int i = 0; i < length.length; i++) {
            length[i] = strings[i].length();
            System.out.println(length[i]);
        }

    }
}
//0701-0704