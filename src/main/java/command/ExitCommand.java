package command;

import duke.Storage;
import duke.Ui;
import task.Tasklist;

/**
 * The ExitCommand class implements the Command interface and represents the command to exit the Duke application.
 */

public class ExitCommand implements Command {
    /**
     * Creates a new ExitCommand instance.
     */
    public ExitCommand() {
    }
    @Override
    public String execute(Ui ui, Tasklist list, Storage storage) {
        return ui.getExitReply();
    }

    /**
     This method implements the isExit method from the Command interface and returns true because ExitCommand represents the command to exit the application.
     @return boolean value 'true' to indicate that the ExitCommand represents the command to exit the application.
     */
    @Override
    public boolean isExit() {
        return true;
    }
}
