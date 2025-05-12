public class Job implements Comparable<Job> {
    private String name;
    private int priority; // higher number = higher priority
    private int deadline; // lower number = sooner deadline

    public Job(String name, int priority, int deadline) {
        this.name = name;
        this.priority = priority;
        this.deadline = deadline;
    }

    public String getName() { return name; }
    public int getPriority() { return priority; }
    public int getDeadline() { return deadline; }

    @Override
    public int compareTo(Job other) {
        if (this.priority != other.priority) {
            return other.priority - this.priority; // Max-heap by priority
        } else {
            return this.deadline - other.deadline; // Earlier deadline first
        }
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ", Deadline: " + deadline + ")";
    }
}
