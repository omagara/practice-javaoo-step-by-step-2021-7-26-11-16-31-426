package practice10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{
    private Klass klass;
    private LinkedList<Klass> klasses;

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
        klasses.forEach(klass1 -> klass1.addTeachers(this));

    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        klass.addTeachers(this);
    }


    public LinkedList<Klass> getClasses() {
        return klasses;
    }

    public String introduce(){
        if (klasses != null) {
            List<String> classes = new ArrayList<>();
            for (Klass cList : klasses) {
                classes.add(String.valueOf(cList.getNumber()));
            }
            String classList = String.join(", ", classes);
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + classList + ".";
        } else {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
        }
    }
    public boolean isTeaching(Student student) {
        return klasses.stream().anyMatch(klass -> klass.isIn(student));
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public void notifyStudentJoined(Student student, Klass klass){
        System.out.print("I am "+getName()+". I know "+student.getName()+" has joined "+klass.getDisplayName()+ ".\n");
    }

    public void notifyAssignedLeader(Student student, Klass klass){
        System.out.print("I am "+getName()+". I know "+student.getName()+" become Leader of "+klass.getDisplayName()+ ".\n");
    }
}
