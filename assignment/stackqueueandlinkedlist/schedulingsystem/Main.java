package assignment.stackqueueandlinkedlist.schedulingsystem;

public class Main {

	public static void main(String[] args) {

		SchedulerForCPU scheduler = new SchedulerForCPU();

        scheduler.addJob(new Job(1, 10, 1));
        scheduler.addJob(new Job(2, 7, 5));
        scheduler.addJob(new Job(4, 4, 3));
        scheduler.addJob(new Job(3, 6, 1));
        scheduler.addJob(new Job(4, 4, 3));
        scheduler.addJob(new Job(5, 3, 3));

        scheduler.runScheduler();
	}

}
