@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobSchedulerService schedulerService;

    @PostMapping("/submit")
    public ResponseEntity<String> submitJob(@RequestParam String payload) {
        Job job = new Job(UUID.randomUUID().toString(), payload);
        schedulerService.submitJob(job);
        return ResponseEntity.ok("Job submitted");
    }
}
