package CircularLinkedList.taskscheduler;

public class TaskOperations {
    private static TaskNode head;
    private static TaskNode tail;
    private static TaskNode currentTask = null;

    public static void addAtBeginning(String taskId, String taskName, int priority, String dueDate){
        TaskNode task = new TaskNode(taskId, taskName, priority, dueDate);

        if(head == null){
            head = tail = task;
            System.out.println("Task added at the beginning");
            return;
        }

        task.next = head;
        head = task;
        tail.next = task;
        System.out.println("Task added at the beginning");
    }

    public static void addAtEnd(String taskId, String taskName, int priority, String dueDate){
        TaskNode task = new TaskNode(taskId, taskName, priority, dueDate);

        if(head == null){
            head = tail = task;
            System.out.println("Task added at the end");
            return;
        }

        task.next = head;
        tail.next = task;
        tail = task;
        System.out.println("Task added at the end");
    }

    public static void addAtSpecific(String taskId, String taskName, int priority, String dueDate, int index){
        if(index == 1){
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        TaskNode task = new TaskNode(taskId, taskName, priority, dueDate);

        int counter = 1;
        TaskNode temp = head.next;
        TaskNode prev = null;

        while (counter != index) {
            if (temp != head) {
                prev = temp;
                temp = temp.next;
                counter++;
            } else {
                System.out.println("Invalid index");
                return;
            }
        }

        prev.next = task;
        task.next = temp;
    }

    public static void deleteByTaskId(String taskId){
        if(head == null){
            System.out.println("Task is empty");
            return;
        }

        if(head.getTaskId().equals(taskId)){
            tail.next = head.next;
            head = head.next;
            System.out.println(taskId + " task is deleted");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = tail;
        while (!temp.getTaskId().equals(taskId)){
            if(temp.next == head){
                System.out.println(taskId + " task not present");
                return;
            }

            prev = temp;
            temp = temp.next;
        }

        temp = temp.next;
        prev.next = temp;
        System.out.println(taskId + " task is deleted");
    }

    public static void viewCurrentTask(){
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        if (currentTask == null) {
            currentTask = head;
        }
        System.out.println("Current Task: " + currentTask.getTaskName() + " (Priority: " + currentTask.getPriority() + ")");
        currentTask = currentTask.next;
    }

    public static void searchByPriority(int priority){
        if(head == null){
            System.out.println("Task list is empty");
            return;
        }

        if(head.getPriority() == priority){
            System.out.printf("%-8s%-20s%-10s%-12s%n", "Task Id", "Task Name", "Priority", "Due Date");
            System.out.printf("%-8s%-20s%-10d%-12s%n", head.getTaskId(), head.getTaskName(), head.getPriority(), head.getDueDate());
        }

        TaskNode temp = head.next;
        while (temp != head) {
            if(temp.getPriority() == priority){
                System.out.printf("%-8s%-20s%-10s%-12s%n", "Task Id", "Task Name", "Priority", "Due Date");
                System.out.printf("%-8s%-20s%-10d%-12s%n", temp.getTaskId(), temp.getTaskName(), temp.getPriority(), temp.getDueDate());
            }
            temp = temp.next;
        }

        System.out.println("No task has " + priority + " priority.");
    }

    public static void displayTasks(){
        TaskNode temp = head;
        System.out.printf("%-8s%-20s%-10s%-12s%n", "Task Id", "Task Name", "Priority", "Due Date");
        while (temp != tail){
            System.out.printf("%-8s%-20s%-10d%-12s%n", temp.getTaskId(), temp.getTaskName(), temp.getPriority(), temp.getDueDate());
            temp = temp.next;
        }
        System.out.printf("%-8s%-20s%-10d%-12s%n", tail.getTaskId(), tail.getTaskName(), tail.getPriority(), tail.getDueDate());
    }
}
