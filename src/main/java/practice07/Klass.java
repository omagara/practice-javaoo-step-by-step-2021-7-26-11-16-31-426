package practice07;

public class Klass {
    private int number;
    private String displayName;

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
}
