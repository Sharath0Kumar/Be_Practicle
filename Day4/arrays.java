package Day4;

class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

}

public class arrays {
    public static void main(String[] args) {
        Student s1 = new Student ("Bob", 20);
        s1.display();
        }
    }
