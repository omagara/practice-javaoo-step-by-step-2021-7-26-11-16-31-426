package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> klasses;

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }


    public LinkedList<Klass> getClasses() {
        return klasses;
    }

}
