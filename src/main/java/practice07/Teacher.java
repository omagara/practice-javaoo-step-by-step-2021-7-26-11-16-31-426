package practice07;

public class Teacher extends Person{
    private practice07.Klass klass;

    public Teacher(int id, String name, int age, practice07.Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }
}
