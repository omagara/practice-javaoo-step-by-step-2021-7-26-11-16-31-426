package practice09;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList<Klass> linkedList;


    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
    }

    public LinkedList<Klass> getClasses() {
        return this.linkedList = linkedList;
    }

    public String introduce() {
        List <String> classes = new ArrayList<>();
        for (Klass cList:linkedList){
            classes.add(String.valueOf(cList.getNumber()));
        }
        String classList = String.join(", ",classes);
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + classList + ".";
    }
}