package tasks08.tasks0826;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = new int[20];
        /*BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i < array.length) {
            array[i] = Integer.parseInt(console.readLine());
            i++;
        }*/

        for(int j = 0; j < array.length; j++) {
            array[j] = j;
        }
    }

    public static void sort(int[] array) {
        int i;
        for(i = 1; i < array.length; i++) {
            if(array[i] < array[i-1]) {
                int num = array[i];
                array[i] = array[i-1];
                array[i-1] = num;
            }
        }
        for(int j = 0; j < 3; j++) {
            System.out.println(array[19-j]);
        }
    }
}
