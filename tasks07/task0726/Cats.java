package tasks07.task0726;

public class Cats {
    String name;
    int age;
    int weight;
    int tail;
    public Cats(String name, int age, int weight, int tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat's name = " + name +
                ", age = " + age +
                ", weight = " + weight +
                ", tail = " + tail;
    }
}
