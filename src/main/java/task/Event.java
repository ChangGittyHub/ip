package task;

import java.time.LocalDate;

public class Event extends Task{
    private LocalDate startDetails;
    private LocalDate endDetails;

    public Event(String name, LocalDate startDetails, LocalDate endDetails) {
        super(name);
        this.startDetails = startDetails;
        this.endDetails = endDetails;
    }

    @Override
    public String getSaveFormat() {
        return "E" + super.getSaveFormat() + " | " + startDetails + " | " + endDetails;
    }


    @Override
    public String toString() {
        return "[E]" + super.toString() + "(" + startDetails + " : " + endDetails + ")";
    }


}
