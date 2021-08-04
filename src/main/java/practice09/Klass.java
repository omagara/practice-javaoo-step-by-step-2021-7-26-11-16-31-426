package practice09;


import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String toString() {
        return "Klass{" +
                "number=" + number +
                ", leader=" + leader +
                ", displayName='" + displayName + '\'' +
                ", members=" + members +
                '}';
    }

    public void appendMember(Student student){
        members.add(student);
    }
}
