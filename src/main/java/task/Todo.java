package task;

public class Todo extends Task{
    public Todo(String name) {
        super(name);
    }

    @Override
    public String toSaveFormat() {
        return "T" + super.toSaveFormat();
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
