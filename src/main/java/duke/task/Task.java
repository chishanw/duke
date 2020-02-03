package duke.task;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public String getDescription() {
        return this.description;
    }

    public String getIsDone() {
        if (this.isDone) {
            return "[O] ";
        } else {
            return "[X] ";
        }
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }
}