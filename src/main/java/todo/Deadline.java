package todo;

/**
 * A class representing individual tasks
 * with a deadline
 *
 * @author celeschai
 */
public class Deadline extends Task{
    private String deadline;

    public Deadline(String name, String deadline) {
        super(name);
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return String.format("[D]%s (by: %s)",
                super.toString(),
                this.deadline);
    }
}
