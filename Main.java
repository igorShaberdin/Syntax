import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Array newArray = new Array();
        int[] array = newArray.initializeArray();
        int max = newArray.max(array);
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        Array ton = new Array();
        ton.arrays();
    }
}
