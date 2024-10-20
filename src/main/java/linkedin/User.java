package linkedin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class User {
    private String userId;
    private String name;
    private String userName;
    private String password;
    private String email;
    private Profile profile;
    private List<Connection> connectionList;
    // userId, list of messages
    private Map<String,List<Messages>> messagesList;
    //JobId, list of applied jobs
    private Map<String,List<Job>> appliedJob;

    public User(String userId, String name, String userName, String password, String email) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.email = email;
        connectionList = new ArrayList<>();
        messagesList = new ConcurrentHashMap<>();
        appliedJob = new ConcurrentHashMap<>();
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Connection> getConnectionList() {
        return connectionList;
    }

    public void setConnectionList(List<Connection> connectionList) {
        this.connectionList = connectionList;
    }

    public Map<String, List<Messages>> getMessagesList() {
        return messagesList;
    }

    public void setMessagesList(Map<String, List<Messages>> messagesList) {
        this.messagesList = messagesList;
    }

    public Map<String, List<Job>> getAppliedJob() {
        return appliedJob;
    }

    public void setAppliedJob(Map<String, List<Job>> appliedJob) {
        this.appliedJob = appliedJob;
    }
}
