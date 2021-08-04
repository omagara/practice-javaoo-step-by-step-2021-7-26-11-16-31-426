package practice06;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass != null) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + klass.getDisplayName() + ".";
        }else {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student studentName){
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + studentName.getName() + ".";
    }
}
