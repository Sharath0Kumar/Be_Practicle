package Classes_Objects;
class Student{
    long rollNo;
    String branch;
    String name;
    char section;
}
public class classes_and_obj{
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        s1.rollNo = 101;
        s1.branch = "CSE";
        s1.name = "Alice";
        s1.section = 'A';
        s2.rollNo = 102;
        s2.branch = "ECE";
        s2.name = "Bob";
        s2.section = 'B';
        System.out.println("Student 1: " + s1.name + ", Roll No: " + s1.rollNo + ", Branch: " + s1.branch + ", Section: " + s1.section);
        System.out.println("Student 2: " + s2.name + ", Roll No: " + s2.rollNo + ", Branch: " + s2.branch + ", Section: " + s2.section);
    }
    
    
}