package linkedin;

public class Job {
    private String id;
    private String title;
    private String description;
    private String jobDetails;

    public Job(String id, String title, String description, String jobDetails) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.jobDetails = jobDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobDetails() {
        return jobDetails;
    }

    public void setJobDetails(String jobDetails) {
        this.jobDetails = jobDetails;
    }
}
