package SinglyLinkedList.studentrecordmanagement;

public class StudentOperations {
    private static StudentNode head;

    public static void addAtBeginning(int number, String name, int age, String grade) {
        StudentNode student = new StudentNode(number, name, age, grade);
        student.next = head;
        head = student;
        System.out.println("Student added at the beginning");
    }

    public static void addAtEnd(int number, String name, int age, String grade) {
        StudentNode student = new StudentNode(number, name, age, grade);
        if (head == null) {
            head = student;
            System.out.println("Student added at the end.");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = student;
        System.out.println("Student added at the end");
    }

    public static void addAtSpecific(int number, String name, int age,String grade, int index) {
        if (index == 1) {
            addAtBeginning(number, name, age, grade);
            return;
        }

        StudentNode student = new StudentNode(number, name, age, grade);

        int counter = 1;
        StudentNode temp = head;
        StudentNode prev = null;

        while (counter != index) {
            if (temp != null) {
                prev = temp;
                temp = temp.next;
                counter++;
            } else {
                System.out.println("Invalid index");
                return;
            }
        }
        prev.next = student;
        student.next = temp;
    }

    public static void deleteByRollNumber(int rollNumber){
        if(head == null){
            System.out.println("Record is empty");
            return;
        }

        if(head.getRollNumber() == rollNumber){
            head = head.next;
            System.out.println(rollNumber + " record is deleted");
            return;
        }

        StudentNode prev = null;
        StudentNode temp = head;

        while (temp.getRollNumber() != rollNumber){
            if(temp.next == null){
                System.out.println(rollNumber + " record not present");
                return;
            }

            prev = temp;
            temp = temp.next;
        }

        if(temp.next == null){
            prev.next = null;
            System.out.println(rollNumber + " record is deleted");
        }
        else{
            temp = temp.next;
            prev.next = temp;
            System.out.println(rollNumber + " record is deleted");
        }
    }

    public static void searchByRollNumber(int rollNumber){
        if(head == null){
            System.out.println("Record is empty");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            if(temp.getRollNumber() == rollNumber){
                System.out.printf("%-12s%-15s%-4s%-5s%n", "Roll number", "Name", "Age", "Grade");
                System.out.printf("%-12d%-15s%-4d%-5s%n", temp.getRollNumber(), temp.getName(), temp.getAge(), temp.getGrade());
                return;
            }
            temp = temp.next;
        }

        System.out.println(rollNumber + " record not found");
    }

    public static void updateGradeByRollNumber(int rollNumber, String grade){
        if(head == null){
            System.out.println("Record is empty");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            if(temp.getRollNumber() == rollNumber){
                temp.setGrade(grade);
                System.out.println("Grade updated");
                System.out.printf("%-12s%-15s%-4s%-5s%n", "Roll number", "Name", "Age", "Grade");
                System.out.printf("%-12d%-15s%-4d%-5s%n", temp.getRollNumber(), temp.getName(), temp.getAge(), temp.getGrade());
                return;
            }
            temp = temp.next;
        }

        System.out.println(rollNumber + " record not found");
    }

    public static void displayRecords(){
        StudentNode temp = head;
        System.out.printf("%-12s%-15s%-4s%-5s%n", "Roll number", "Name", "Age", "Grade");
        while (temp != null) {
            System.out.printf("%-12d%-15s%-4d%-5s%n", temp.getRollNumber(), temp.getName(), temp.getAge(), temp.getGrade());
            temp = temp.next;
        }
    }
}
