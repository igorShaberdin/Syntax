package tasks07.task0724;

public class Human {
    String name;
    boolean sex;
    int age;
    Human father;
    Human mother;
    public Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }
    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return  "name=" + name +
                ", sex=" + (sex ? "мужской" : "женский") +
                ", age=" + age +
                ", father=" + father +
                ", mother=" + mother;
    }
}
