package practice05;

public class Teacher extends Person{
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public int getKlass() {
        return klass;
    }

    public String introduce(){
        return "My name is "+ getName() + ". I am "+getAge()+" years old. I am a Teacher. I teach Class " + klass +".";
    }
}
