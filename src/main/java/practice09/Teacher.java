package practice09;


import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{
    private LinkedList<Klass> linkedList = new LinkedList<Klass>();


    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList=linkedList;
    }

    public LinkedList<Klass> getClasses(){
        return this.linkedList=linkedList;
    }
}
