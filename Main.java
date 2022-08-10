import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Array newArray = new Array();
        int[] array = newArray.initializeArray();
        for(int res : array) {
            System.out.print(res + " ");
        }
        newArray.reverseArray(array);
        for(int res : array) {
            System.out.print(res + " ");
        }
    }
}
