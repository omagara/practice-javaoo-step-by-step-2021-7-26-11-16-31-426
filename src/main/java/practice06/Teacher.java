package practice06;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        return "My name is "+ getName() + ". I am "+getAge()+" years old. I am a Teacher. I teach " + klass.getDisplayName() +".";
    }
}
