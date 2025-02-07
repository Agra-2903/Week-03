package CircularLinkedList.taskscheduler;

import java.util.Scanner;

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Add task at the beginning");
            System.out.println("2. Add task at the end");
            System.out.println("3. Add task at the position");
            System.out.println("4. Delete task by Task Id");
            System.out.println("5. Search task by Priority");
            System.out.println("6. Dislpay tasks details");
            System.out.println("7. View current task and move to next");
            System.out.println("8. Exit");

            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.print("Enter Task Id, Task Name, Priority and Due Date: ");
                    TaskOperations.addAtBeginning(sc.next(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 2:
                    System.out.print("Enter Task Id, Task Name, Priority and Due Date: ");
                    TaskOperations.addAtEnd(sc.next(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 3:
                    System.out.print("Enter Task Id, Task Name, Priority and Due Date, Position: ");
                    TaskOperations.addAtSpecific(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Roll Number to delete: ");
                    TaskOperations.deleteByTaskId(sc.next());
                    break;
                case 5:
                    System.out.print("Enter Roll Number to search: ");
                    TaskOperations.searchByPriority(sc.nextInt());
                    break;
                case 6:
                    TaskOperations.displayTasks();
                    break;
                case 7:
                    TaskOperations.viewCurrentTask();
                    break;
                case 8:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
