package practice07;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }
    public String getDisplayName() {
        displayName = "Class " + number;
        return displayName;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student assignLeader(Student student){
        leader = student;
        return leader;
    }

    public Student getLeader() {
        return leader;
    }
}
