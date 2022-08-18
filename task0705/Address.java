package task0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Address {
    void streetsAndHouses() throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int odd = 0;
        int notOdd = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(console.readLine());
            if (i / 2 == 0 || i == 0) {
                odd += array[i];
            }
            else if (i/2 != 0) {
                notOdd = array[i] += 0;
            }
        }
        String answer = odd > notOdd ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(answer);

//        int evenStreetPopulation = 0;
//        int oddStreetPopulation = 0;
//        for (int i = 0; i < arr.length - 1; i += 2) {
//            evenStreetPopulation += arr[i];
//            oddStreetPopulation += arr[i + 1];
//        }
//        evenStreetPopulation += arr[arr.length - 1];
//
//        System.out.printf("В домах с %s номерами проживает больше жителей.",
//                evenStreetPopulation < oddStreetPopulation ? "нечетными" : "четными");
    }
}
