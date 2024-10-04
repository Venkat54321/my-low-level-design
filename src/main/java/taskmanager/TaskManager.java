package taskmanager;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class TaskManager {
    private static TaskManager instance = null;
    private Map<Integer,Task> taskList;
    private Map<Integer,List<Task>> userTaskMapping;

    private TaskManager(){
        taskList = new ConcurrentHashMap<>();
        userTaskMapping = new ConcurrentHashMap<>();
    }

    public synchronized static TaskManager getInstance(){
        if(instance == null){
            instance = new TaskManager();
        }
        return instance;
    }

    public void createTask(Task task){
        taskList.put(task.getTaskId(),task);
        assignedTaskToUser(task.getAssignedUser(),task);
    }

    private void assignedTaskToUser(User assignedUser, Task task) {
        userTaskMapping.computeIfAbsent(assignedUser.getUserId(), k -> new CopyOnWriteArrayList<>()).add(task);
    }

}
