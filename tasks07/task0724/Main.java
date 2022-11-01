package tasks07.task0724;

public class Main {
    public static void main(String[] args) {
        Human grandpa1 = new Human("Fedor", true, 55);
        Human grandma1 = new Human("Maria", false, 55);
        Human grandpa2 = new Human("Vova", true, 60);
        Human grandma2 = new Human("Lisa", false, 55);
        Human father = new Human("Georgy", true, 35, grandpa2,grandma2);
        Human mother = new Human("Nina", false, 30, grandpa1, grandma1);
        Human child1 = new Human("Tany", false, 12, father, mother);
        Human child2 = new Human("Sveta", false, 4, father, mother);
        Human child3 = new Human("Robert", true, 2, father, mother);
        System.out.println(child3 + " " + "\n" + child2 + "\n" + child1);
    }
}
