package tasks07.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<Integer> numbers3 = new ArrayList<>();
        ArrayList<Integer> another = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(Integer.valueOf(console.readLine()));

        }
        for (Integer number : numbers) {
            if ((number % 2) == 0) {
                numbers2.add(number);
            } else if ((number % 3) == 0) {
                numbers3.add(number);
            } else {
                another.add(number);
            }
        }
        Print num = new Print();
        num.printList(another);
        num.printList(numbers2);
        num.printList(numbers3);
    }
}


