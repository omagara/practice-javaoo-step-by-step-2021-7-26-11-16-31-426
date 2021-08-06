package practice09;

import java.util.Objects;

public class Klass {
    private final int number;
    private Student leader;


    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student leader) {
        if (leader.getKlass().getNumber() == this.number) {
            this.leader = leader;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }


    public void appendMember(Student member) {
        member.setKlass(this);
    }

    public boolean isIn(Student student) {
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
