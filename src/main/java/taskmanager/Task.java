package taskmanager;

public class Task {
    private Integer taskId;
    private String taskTitle;
    private String description;
    private Integer priority;
    private Status status;
    private User assignedUser;

    public Task(Integer taskId, String taskTitle, String description, Integer priority, Status status,User assignedUser) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.assignedUser = assignedUser;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }
}
