package practice09;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {
    private LinkedList<Klass> klasses;


    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return klasses;
    }

    public String introduce() {
        if (klasses != null) {
            List<String> classes = new ArrayList<>();
            for (Klass cList : klasses) {
                classes.add(String.valueOf(cList.getNumber()));
            }
            String classList = String.join(", ", classes);
            return super.introduce()+" I am a Teacher. I teach Class " + classList + ".";
        } else {
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
    }

    public boolean isTeaching(Student student) {
        return klasses.stream().anyMatch(klass -> klass.isIn(student));
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return super.introduce()+" I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce()+" I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}