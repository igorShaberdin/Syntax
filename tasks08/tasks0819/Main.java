package tasks08.tasks0819;

import java.util.Set;

import static tasks08.tasks0819.Cat.createCats;

public class Main {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.stream().findFirst().orElse(null));
        Cat.printCat(cats);
    }
}
