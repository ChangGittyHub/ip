package command;

import duke.Storage;
import duke.Ui;
import task.Tasklist;

public class MarkCommand implements Command {
    private int index;

    public MarkCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(Ui ui, Tasklist list, Storage storage) {
        list.markTaskAsDone(index);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
