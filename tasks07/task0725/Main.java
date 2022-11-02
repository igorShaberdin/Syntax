package tasks07.task0725;

public class Main {
    public static final int A = 5;
    public final static int B = 2;
    public final static int C = A * B;
    public static int getValue() {
        return C;
    }
    public static void main(String[] args) {
        System.out.println(getValue());
    }
}
