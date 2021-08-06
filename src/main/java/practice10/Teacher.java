package practice10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{
    private LinkedList<Klass> klasses;

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }


    public LinkedList<Klass> getClasses() {
        return klasses;
    }

    public String introduce(){
        List<String> classes = new ArrayList<>();
        for (Klass cList : klasses) {
            classes.add(String.valueOf(cList.getNumber()));
        }
        String classList = String.join(", ", classes);
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + classList + ".";
    }

}
