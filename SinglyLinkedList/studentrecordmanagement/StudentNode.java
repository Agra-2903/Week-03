package SinglyLinkedList.studentrecordmanagement;

public class StudentNode {
    private final int rollNumber;
    private String name;
    private int age;
    private String grade;
    StudentNode next;

    public StudentNode(int number, String name, int age, String grade){
        this.rollNumber = number;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
