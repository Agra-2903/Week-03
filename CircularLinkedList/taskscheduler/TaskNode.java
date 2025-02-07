package CircularLinkedList.taskscheduler;

public class TaskNode {
    private final String taskId;
    private String taskName;
    private int priority;
    private String dueDate;
    TaskNode next;

    public TaskNode(String taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }


}
