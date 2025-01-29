package SinglyLinkedList.studentrecordmanagement;

import java.util.Scanner;

public class StudentRecordManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Add student at the beginning");
            System.out.println("2. Add student at the end");
            System.out.println("3. Add student at the position");
            System.out.println("4. Delete student by Roll Number");
            System.out.println("5. Search student by Roll Number");
            System.out.println("6. Dislpay students details");
            System.out.println("7. Update grade of the student by Roll Number");
            System.out.println("8. Exit");

            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.print("Enter Roll Number, Name, Age, and Grade: ");
                    StudentOperations.addAtBeginning(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 2:
                    System.out.print("Enter Roll Number, Name, Age, and Grade: ");
                    StudentOperations.addAtEnd(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 3:
                    System.out.print("Roll Number, Name, Age, and Grade, Enter Position: ");
                    StudentOperations.addAtSpecific(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Roll Number to delete: ");
                    StudentOperations.deleteByRollNumber(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Roll Number to search: ");
                    StudentOperations.searchByRollNumber(sc.nextInt());
                    break;
                case 6:
                    StudentOperations.displayRecords();
                    break;
                case 7:
                    System.out.print("Enter Roll Number and new Grade: ");
                    StudentOperations.updateGradeByRollNumber(sc.nextInt(), sc.next());
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
