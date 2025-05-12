import java.util.PriorityQueue;

public class JobScheduler {
    private PriorityQueue<Job> jobQueue;

    public JobScheduler() {
        jobQueue = new PriorityQueue<>();
    }

    public void addJob(String name, int priority, int deadline) {
        Job job = new Job(name, priority, deadline);
        jobQueue.offer(job);
        System.out.println("Added: " + job);
    }

    public void processNextJob() {
        if (jobQueue.isEmpty()) {
            System.out.println("No jobs to process.");
        } else {
            Job job = jobQueue.poll();
            System.out.println("Processing: " + job);
        }
    }

    public void viewPendingJobs() {
        if (jobQueue.isEmpty()) {
            System.out.println("No pending jobs.");
        } else {
            System.out.println("Pending Jobs:");
            for (Job job : jobQueue) {
                System.out.println(" - " + job);
            }
        }
    }
}
