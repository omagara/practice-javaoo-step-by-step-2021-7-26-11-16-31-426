package practice05;

public class Teacher extends Person{
    private int klass;

    public int getKlass() {
        return klass;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
}
