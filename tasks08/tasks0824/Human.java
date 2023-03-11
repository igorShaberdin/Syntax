package tasks08.tasks0824;

import java.util.ArrayList;

public class Human {
    String name;
    boolean sex;
    int age;
    ArrayList<Human> children = new ArrayList<>();

    public Human(String name, boolean sex, int age, ArrayList<Human> children) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.children = children;
    }
    public Human(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Имя: " +  this.name;
        text += ", возраст: " + this.age;
        text += ", пол: " + (this.sex ? "мужской" : "женский");

        int childCount = this.children.size();
        if(childCount > 0) {
            text += ", дети: " + this.children.get(0).name;
            for(int i = 1; i < childCount; i++) {
                Human child = this.children.get(i);
                text += ", " + child.name;
            }

        }
        return text;
    }
}
