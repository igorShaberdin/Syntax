package tasks08.tasks0820;

import java.util.HashSet;

public class Main {

    public static HashSet<Object> join(HashSet<Cat> set, HashSet<Dog> set1) {
        HashSet<Object> union = new HashSet<>(set);
        union.addAll(set1);
        return union;
    }

    public static void removeCats(HashSet<Object> pets, HashSet<Cat> cats) {
        cats.forEach(pets::remove);
    }

    public static void printPets(HashSet<Object> pets) {
        pets.forEach(System.out::println);
    }

    public static void main(String[] args) {
        HashSet<Cat> cats = Cat.createCats();
        HashSet<Dog> dogs = Dog.createDogs();
        HashSet<Object> pets = Main.join(cats, dogs);
        Main.removeCats(pets, cats);
        Main.printPets(pets);
    }

    public static class Cat {
        public static HashSet<Cat> createCats() {
            HashSet<Cat> cat = new HashSet<>();
            for (int i = 0; i < 4; i++) {
                cat.add(new Cat());
            }
            return cat;
        }
    }

    public static class Dog {
        public static HashSet<Dog> createDogs() {
            HashSet<Dog> dog = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                dog.add(new Dog());
            }
            return dog;
        }
    }
}
