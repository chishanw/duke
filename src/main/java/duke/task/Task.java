package duke.task;

/**
 * Represents a Task.
 * It has a description, and is marked as done or not.
 */
public class Task {
    protected String description;
    protected boolean isDone;

    /**
     * Constructs a new Task instance.
     * @param description The description of the task.
     * @param isDone Whether the task is done or not.
     */
    public Task(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    /**
     * Returns the description of the task.
     * @return The description of the task.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Returns whether the task is marked as done.
     * @return A boolean marking the task as done or not.
     */
    public String getIsDone() {
        if (this.isDone) {
            return "[\u2713] ";
        } else {
            return "[\u2718] ";
        }
    }

    /**
     * Sets the task as done.
     * @param isDone A boolean marking the task as done or not.
     */
    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }
}