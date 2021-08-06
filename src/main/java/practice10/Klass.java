package practice10;
import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int number;
    private Student leader;
    private List<Student> members = new ArrayList<>();

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
        if (members.contains(leader)){
            this.leader=leader;
        }else {
            System.out.print("It is not one of us.\n");
        }
    }
    public Student getLeader() {
        return leader;
    }

}
