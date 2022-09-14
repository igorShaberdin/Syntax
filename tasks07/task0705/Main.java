package tasks07.task0705;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Integer.parseInt(console.readLine());
//        }
//        int[] array1 = new int[10];
//        int[] array2 = new int[10];
//        System.arraycopy(array, 0, array1, 0, array1.length);
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = array[i + array2.length];
//            System.out.println(array2[i]);
//        }
//        Address howMuch = new Address();
//        howMuch.streetsAndHouses();
        ArrayList<String> line = new ArrayList<>();
        line.add("don't touch my straps");
        line.add("forget about it");
        line.add("you a nerd");
        line.add("please would be nice");
        line.add("you have a problem?");
        System.out.println(line.size());
        int largest = line.indexOf(0);
        int index = 0;
        for(int i = 0; i < line.size(); i++) {
            if (line.get(i).length() > largest) {
                largest = line.get(i).length();
                index = i;
            }
        }
           // System.out.printf("index: %s, size: %s, line: %s", index, largest, line.get(index));
        //0708
        ArrayList<String> lines = new ArrayList<>(Arrays.asList("don't touch my straps", "you a nerd", "forget about it"));
        //for (int i = 0; i < 5; i++) {
        //            strings.add(reader.readLine());
        //        }
        int smallest = Integer.MAX_VALUE;
        int indexs = 0;
        for (int i = 0; i < lines.size(); i++) {
            if(lines.get(i).length() < smallest) {
                smallest = lines.get(i).length();
                indexs = i;
            }
        }
        System.out.println(lines.get(indexs));
    }
}
