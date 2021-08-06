package practice10;
import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int number;
    private Student leader;
    private List<Teacher> teachers;


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
        }
        if (teachers != null) {
            teachers.stream().forEach(teacher -> teacher.notifyAssignedLeader(leader, this));
        }else {
            System.out.print("It is not one of us.\n");
        }
    }
    public Student getLeader() {
        return leader;
    }

    public boolean isIn(Student student) {
        return this.equals(student.getKlass());
    }

    public void appendMember(Student member) {
        if (member.getKlass().getNumber() == this.number) {
            member.setKlass(this);
        } if (teachers != null) {
            teachers.stream().forEach(teacher -> teacher.notifyStudentJoined(member, this));
        }
    }
    public void addTeachers(Teacher teacher) {
        teachers = new ArrayList<>();
        teachers.add(teacher);
    }
}
