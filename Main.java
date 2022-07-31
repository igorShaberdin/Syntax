import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Array newArray = new Array();
        int[] array = newArray.initializeArray();
        int max = newArray.max(array);
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
