package oop.src.Student;

public class Student {
    int id;
    String name;
    String email;
    String phone;
    float tall;
    float weight;

    public void printInfos() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Tall: " + tall);
        System.out.println("Weight: " + weight);
        System.out.println("===================================");
    }

    public void passExam() {
        System.out.println("Student " + name + " is passing the exam....");
    }

    public void failExam() {
        System.out.println("Student " + name + " is failing the exam....");
    }

    public void study() {
        System.out.println("Student " + name + " is studying....");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.id = 1;
        s1.name = "Ali";
        s1.email = "Ali@email.com";
        s1.phone = "1234567890";
        s1.tall = 1.75f;
        s1.weight = 70.5f;
        s1.printInfos();
        // ===================================
        s2.id = 2;
        s2.name = "Veli";
        s2.email = "Veli@gmail.com";
        s2.phone = "0987654321";
        s2.tall = 1.80f;
        s2.weight = 80.0f;
        s2.printInfos();
    }
}
