package practice10;

public class Klass {
    private int number;
    private String displayName;
    public int getNumber() {
        return number;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        displayName = "Class " + number;
        return displayName;
    }
}
