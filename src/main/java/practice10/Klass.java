package practice10;
import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int number;
    private Student leader;


    public int getNumber() {
        return number;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }
    public void assignLeader(Student leader){
        if (leader.getKlass().getNumber() == this.number) {
            this.leader = leader;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }
    public Student getLeader() {
        return leader;
    }

    public boolean isIn(Student student) {
        return this.equals(student.getKlass());
    }

    public void appendMember(Student member){
        member.setKlass(this);
    }

}
