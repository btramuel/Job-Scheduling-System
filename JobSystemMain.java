public class JobSystemMain {
    public static void main(String[] args) {
        JobScheduler scheduler = new JobScheduler();

        scheduler.addJob("Print report", 7, 5);
        scheduler.addJob("Send emails", 8, 2);
        scheduler.addJob("Fix bug", 8, 1);
        scheduler.addJob("Deploy update", 5, 3);

        System.out.println();
        scheduler.viewPendingJobs();

        System.out.println();
        scheduler.processNextJob();
        scheduler.processNextJob();

        System.out.println();
        scheduler.viewPendingJobs();
    }
}
