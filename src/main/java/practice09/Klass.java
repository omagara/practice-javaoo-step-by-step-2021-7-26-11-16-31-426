package practice09;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private int number;
    private Student leader;
    private String displayName;
    private List<Student> members = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        displayName = "Class " + number;
        return displayName;
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student leader){
        if (members.contains(leader)){
            this.leader=leader;
        }else {
            System.out.print("It is not one of us.\n");
        }
    }
    public Student getLeader() {
        return leader;
    }


    public void appendMember(Student student){
        members.add(student);
    }

    public boolean isIn(Student student){
        return this.equals(student.getKlass());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
