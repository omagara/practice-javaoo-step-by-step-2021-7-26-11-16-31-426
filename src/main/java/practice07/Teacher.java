package practice07;

import practice06.Student;

public class Teacher extends Person{
    private practice07.Klass klass;

    public Teacher(int id, String name, int age, practice07.Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Teacher(int id, String name, int age) {
        super(id,name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass != null) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + klass.getDisplayName() + ".";
        } else {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(practice07.Student studentName) {
        if (studentName.getKlass().getNumber()!=getKlass().getNumber()) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I don't teach " + studentName.getName() + ".";
        }else {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + studentName.getName() + ".";
        }
    }
}
