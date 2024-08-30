package task;

/**
 * A class representing each individual task
 * Declared as abstract to prevent instantiation.
 *
 * @author celeschai
 */
public abstract class Task {
    private String name = "new task";
    private boolean status = false;

    public Task(String name) {
        this.name = name;
    }

    /**
     * Marks task as completed.
     */
    public void markAsDone() {
        this.status = true;
    }

    /**
     * Marks task as incomplete.
     */
    public void markAsIncomplete() {
        this.status = false;
    }

    @Override
    public String toString() {
        return String.format("[%c] %s",
                this.status
                        ? 'X'
                        : ' ',
                this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Task task)) {
            return false;
        }
        return this.name.equals(task.name);
    }
}
