@Component
public class JobWorker {

    @Autowired
    private JobSchedulerService schedulerService;

    @Scheduled(fixedDelay = 2000)
    public void processJobs() {
        try {
            Job job = schedulerService.fetchJob();
            System.out.println("Processing job: " + job.getPayload());
        } catch (Exception e) {
            System.out.println("Job failed, retrying...");
        }
    }
}
