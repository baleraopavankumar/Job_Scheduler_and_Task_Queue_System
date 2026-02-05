@Service
public class JobSchedulerService {

    private final BlockingQueue<Job> jobQueue = new LinkedBlockingQueue<>();

    public void submitJob(Job job) {
        jobQueue.offer(job);
    }

    public Job fetchJob() throws InterruptedException {
        return jobQueue.take();
    }
}
