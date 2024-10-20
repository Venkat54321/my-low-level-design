package linkedin;

import java.util.ArrayList;
import java.util.List;

public class Employer {
    private String id;
    private String name;
    private String location;
    private List<Job> jobList;

    public Employer(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        jobList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobList() {
        return jobList;
    }

    public void setJobList(List<Job> jobList) {
        this.jobList = jobList;
    }
}
