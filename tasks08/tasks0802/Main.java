package tasks08.tasks0802;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("арбуз - ягода");
        set.add("банан - трава");
        set.add("вишня - ягода");
        set.add("груша - фрукт");
        set.add("дыня - овощ");
        set.add("ежевика - куст");
        set.add("жень-шень - корень");
        set.add("земляника - ягода");
        set.add("ирис - цветок");
        set.add("картофель - клубень");
        for(String s : set) {
            System.out.println(s);
        }
    }
}
