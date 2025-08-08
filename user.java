class Candidate {
    String name;
    String location;
    String occupation;
    long phoeneNo;
}

public class user {
    public static void main(String[] args) {
        Candidate c1 =new Candidate();
        Candidate c2 =new Candidate();
        c1.name = "John";
        c1.location = "New York";
        c1.occupation = "Software Engineer";
        c1.phoeneNo = 1234567890L;
        c2.name = "Jane";
        c2.location = "Los Angeles";
        c2.occupation = "Data Scientist";
        c2.phoeneNo = 9876543210L;
        System.out.println("Candidate 1: " + c1.name + ", Location: " + c1.location + ", Occupation: " + c1.occupation + ", Phone No: " + c1.phoeneNo);
        System.out.println("Candidate 2: " + c2.name + ", Location: " + c2.location + ", Occupation: " + c2.occupation + ", Phone No: " + c2.phoeneNo);
    }
}