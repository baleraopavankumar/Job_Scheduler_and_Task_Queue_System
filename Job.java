public class Job {

    private String id;
    private String payload;
    private int retryCount;

    public Job(String id, String payload) {
        this.id = id;
        this.payload = payload;
        this.retryCount = 0;
    }
}
