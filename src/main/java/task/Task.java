package task;

public class Task {
    private boolean isMarked;
    private String name;


    public Task(String name) {
        this.isMarked = false;
        this.name = name;
    }

    public void markDone() {
        isMarked = true;
    }

    public void unmark() {
        isMarked = false;
    }

    public String getStatusICon() {
        return (isMarked ? "X" : " ");
    }

    public String getSaveFormat() {
        String markToInt = this.isMarked? "1" : "0";
        return " | " + markToInt + " | " + name ;
    }


    @Override
    public String toString() {
        return "[" + this.getStatusICon() + "] " + this.name;
    }

}
