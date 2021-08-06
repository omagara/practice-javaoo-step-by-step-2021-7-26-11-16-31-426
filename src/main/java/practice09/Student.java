package practice09;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }
    public void setKlass (Klass klass){
        this.klass = klass;
    }
    public String introduce() {
        if (klass.getLeader() == null) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am at " + klass.getDisplayName() + ".";
        } else {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am Leader of " + klass.getDisplayName() + ".";
        }
    }
}
